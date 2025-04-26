package com.gevernova.dsa.timeandspacecomplexity;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingComparison {

    // Method to read a file using FileReader (Character Stream)
    public static void readUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            int character;
            while ((character = fr.read()) != -1) {
                // Simulate some processing on the character (optional)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read a file using InputStreamReader (Byte Stream)
    public static void readUsingInputStreamReader(String filePath) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            int character;
            while ((character = isr.read()) != -1) {
                // Simulate some processing on the character (optional)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to compare the performance of FileReader vs InputStreamReader
    public static void compareFileReadingEfficiency(String filePath) {
        // Measure time for FileReader
        long startRec = System.nanoTime();
        readUsingFileReader(filePath);
        long endRec = System.nanoTime();
        long fileReaderTime = endRec - startRec;

        // Measure time for InputStreamReader
        startRec = System.nanoTime();
        readUsingInputStreamReader(filePath);
        endRec = System.nanoTime();
        long inputStreamReaderTime = endRec - startRec;

        // Output the performance results
        System.out.println("FileReader Time: " + (fileReaderTime / 1000000.0) + " ms");
        System.out.println("InputStreamReader Time: " + (inputStreamReaderTime / 1000000.0) + " ms");
    }

    public static void main(String[] args) {
        // File path of the 500MB file (you can replace this with your file path)
        String filePath = "path_to_your_large_file.txt";

        // Compare performance for reading large files
        compareFileReadingEfficiency(filePath);
    }
}

