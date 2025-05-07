package com.gevernova.regex;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        // Create a regex pattern that matches any bad word
        StringBuilder regex = new StringBuilder();
        for (String word : badWords) {
            if (regex.length() > 0) {
                regex.append("|"); // Add OR condition
            }
            regex.append("\\b").append(word).append("\\b");
        }

        // Input sentence
        String input = scanner.nextLine();

        // Replace bad words with ****
        String output = input.replaceAll(regex.toString(), "****");

        System.out.println("Censored Sentence:");
        System.out.println(output);
    }
}
