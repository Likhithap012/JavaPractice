package com.gevernova.strings.levelthree;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Populate frequency array
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store unique characters and their frequencies in a 2D array
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = i; // Character ASCII value
                result[index][1] = charFrequency[i]; // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[][] charFrequencies = findCharacterFrequency(input);

        System.out.println("Character frequencies in the string:");
        for (int[] charFreq : charFrequencies) {
            System.out.println((char) charFreq[0] + ": " + charFreq[1]);
        }

        scanner.close();
    }
}

