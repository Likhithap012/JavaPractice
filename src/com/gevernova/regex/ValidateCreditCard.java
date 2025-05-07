package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular expression for Visa and MasterCard validation
        String regex = "^(4\\d{15}|5\\d{15}$)";

        // Get user input
        System.out.println("Enter a credit card number:");
        String input = scanner.nextLine();

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }

        scanner.close();
    }
}

