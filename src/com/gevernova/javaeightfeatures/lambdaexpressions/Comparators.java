package com.gevernova.javaeightfeatures.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Comparators {
    public static void main(String[] args) {
        // Create a Scanner object to take dynamic input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an empty list to store strings
        List<String> list = new ArrayList<>();

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt(); // Read how many strings user wants to enter
        scanner.nextLine(); // Consume the leftover newline character

        System.out.println("Enter " + n + " strings:");

        // Read n strings from the user
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            list.add(input);
        }

        // Sort the list in descending order of string lengths using Collections.sort() with Lambda
        Collections.sort(list, (a, b) -> b.length() - a.length());

        // OR (modern way) — you can directly use list.sort()
        // list.sort((a, b) -> b.length() - a.length());

        // Print the sorted list
        System.out.println("Sorted list (by descending length):");
        System.out.println(list);

        // Close the scanner
        scanner.close();
    }
}
