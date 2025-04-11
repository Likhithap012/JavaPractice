package com.gevernova.strings.levelone;

import java.util.Scanner;
public class numberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        handleException(input);
        scanner.close();
    }
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Successfully converted: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }
    }

