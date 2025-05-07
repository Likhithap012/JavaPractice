package com.gevernova.regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s{2,}", " ");

        System.out.println("Modified String:");
        System.out.println(output);
    }
}
