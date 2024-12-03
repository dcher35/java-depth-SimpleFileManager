package com.edu.chmnu.ki_123.c3;

import java.io.File;
import java.io.IOException;

public class SimpleFileManager {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/dcher/Documents/Java/java-SimpleFileManager";
        String fileName = "test.txt";

        File file = new File(directoryPath + "/" + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getAbsolutePath());
        } else {
            System.out.println("Couldn't delete file.");
        }
    }
}