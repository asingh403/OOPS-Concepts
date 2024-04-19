package com.poc.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileRecordUpdater {
    private static final Logger logger = LoggerFactory.getLogger(FileRecordUpdater.class);

    public static void main(String[] args) {
        String folderPath = "src/main/java/com/poc/files";
        String newValueC31C36 = "222222";
        String newValueC04C10 = "222222";
        updateAllFilesInFolder(folderPath, newValueC31C36, newValueC04C10);
    }

    public static void updateAllFilesInFolder(String folderPath, String newValueForFirstLine, String newValueForSecondLine) {
        try {
            Files.walk(Paths.get(folderPath))
                .filter(Files::isRegularFile)
                .forEach(file -> updateFileRecords(file, newValueForFirstLine, newValueForSecondLine));
        } catch (IOException e) {
            logger.error("Failed to process files in folder: " + folderPath, e);
        }
    }

    public static void updateFileRecords(Path path, String newValueForFirstLine, String newValueForSecondLine) {
        try {
            List<String> lines = Files.readAllLines(path);
            List<String> updatedLines = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                line = updateLineBasedOnIndex(line, i, newValueForFirstLine, newValueForSecondLine);
                line = replaceBacsPattern(line);
                updatedLines.add(line);
            }

            Files.write(path, updatedLines);
            logger.info("File has been updated: " + path);
        } catch (IOException e) {
            logger.error("An error occurred while updating file: " + path, e);
        }
    }

    private static String updateLineBasedOnIndex(String line, int index, String newValueForFirstLine, String newValueForSecondLine) {
        if (index == 0 && line.length() >= 36) {
            StringBuilder sb = new StringBuilder(line);
            sb.replace(30, 36, String.format("%-6s", newValueForFirstLine));
            line = sb.toString();
        } else if (index == 1 && line.length() >= 10) {
            StringBuilder sb = new StringBuilder(line);
            sb.replace(3, 10, String.format("%-7s", newValueForSecondLine));
            line = sb.toString();
        }
        return line;
    }

    private static String replaceBacsPattern(String line) {
        if (line.contains("bacs12345")) {
            return line.replace("bacs12345", "bacs" + generateRandom5Digits());
        }
        return line;
    }

    private static String generateRandom5Digits() {
        Random random = new Random();
        int num = 10000 + random.nextInt(90000);
        return String.valueOf(num);
    }
}
