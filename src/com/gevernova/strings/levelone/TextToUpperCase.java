package com.gevernova.strings.levelone;

import java.util.Scanner;
public class TextToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder customUpper = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('A' + (ch - 'a'));
            }
            customUpper.append(ch);
        }
        String builtInUpper = input.toUpperCase();
        boolean isEqual = customUpper.toString().equals(builtInUpper);
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Both methods produce the same result: " + isEqual);

        scanner.close();
    }
}
