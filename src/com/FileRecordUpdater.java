package com.poc.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileRecordUpdater {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/poc/files/BDD.BACS18.TST34567.PM";
        String newValueC31C36="222222";
        String newValueC04C10="222222";
        updateFileRecords(filePath, newValueC31C36, newValueC04C10);
    }

    public static void updateFileRecords(String filePath, String newValueForFirstLine, String newValueForSecondLine) {
        Logger logger = LoggerFactory.getLogger(FileRecordUpdater.class);
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            List<String> updatedLines = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (i == 0 && line.length() >= 36) {
                    StringBuilder sb = new StringBuilder(line);
                    sb.replace(30, 36, String.format("%-6s", newValueForFirstLine));
                    line = sb.toString();
                } else if (i == 1 && line.length() >= 10) {
                    StringBuilder sb = new StringBuilder(line);
                    sb.replace(3, 10, String.format("%-7s", newValueForSecondLine));
                    line = sb.toString();
                }
                updatedLines.add(line);
            }

            Files.write(path, updatedLines);
            logger.info("File has been updated.");
        } catch (IOException e) {
            logger.error("An error occurred: " + e.getMessage());
        }
    }
}
