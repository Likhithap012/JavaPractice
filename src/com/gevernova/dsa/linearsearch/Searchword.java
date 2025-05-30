package com.gevernova.dsa.linearsearch;

import java.util.Scanner;

public class Searchword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of sentences
        System.out.print("Enter the number of sentences: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the array of sentences
        String[] sentences = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences[i] = scanner.nextLine();
        }

        // Input the word to search
        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();

        // Linear search for a sentence containing the word
        String result = "Not Found";
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                result = sentence;
                break;
            }
        }

        // Output the result
        System.out.println("Result: " + result);

    }
}
