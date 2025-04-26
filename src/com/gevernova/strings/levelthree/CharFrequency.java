package com.gevernova.strings.levelthree;

import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] charFrequency = new int[256];
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        System.out.println("Character frequencies in the string:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueChars[i] + ": " + charFrequency[uniqueChars[i]]);
        }

        scanner.close();
    }
}
