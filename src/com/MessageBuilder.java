package com.poc.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

/**
 * author: ashutosh
 *
 */
public class MessageBuilder {
    private String message;

    public MessageBuilder(String filePath) throws IOException {
        this.message = readFile(filePath);
    }

    private static String readFile(String filePath) throws IOException {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Failed to read file: " + filePath, e);
        }
    }

    private static String genRandomLengthNums(int digits){
        Random random = new Random();
        long min = (long) Math.pow(10, digits - 1);
        long max = (long) Math.pow(10, digits) - 1;

        long number = min + (long) (random.nextDouble() * (max - min + 1));
        return String.valueOf(number);
    }
    public void updateMessage(int start, int length, String newValue) {
        StringBuilder sb = new StringBuilder(this.message);
        String adjustedNewValue = newValue.length() > length ? newValue.substring(0, length) : newValue;
        sb.replace(start, start + length, adjustedNewValue);
        this.message = sb.toString();
    }

    public String getMessage() {
        return this.message;
    }

    public static void main(String[] args) throws IOException {
        MessageBuilder updater = new MessageBuilder("/Users/ashutoshsingh/Documents/IntellijSpring/CoreJava-POC-Lab/src/main/java/com/poc/files/rawpsn.txt");
        updater.updateMessage(0, 12, "-"+genRandomLengthNums(11)); // Update messageId assuming it starts at index 12 and is 12 characters long
        System.out.println("Updated Message: " + updater.getMessage());
    }
}
