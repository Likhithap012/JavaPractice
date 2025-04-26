package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class FindLongestAndShortestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minimum = Integer.MAX_VALUE; // Use a large initial value
        int maximum = Integer.MIN_VALUE; // Use a small initial value
        input = input + ' ';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (count > 0) { // Ensure counting only non-empty words
                    minimum = Math.min(count, minimum);
                    maximum = Math.max(count, maximum);
                    count = 0;
                }
            } else {
                count++;
            }
        }

        System.out.println(minimum);
        System.out.println(maximum);
    }
}
