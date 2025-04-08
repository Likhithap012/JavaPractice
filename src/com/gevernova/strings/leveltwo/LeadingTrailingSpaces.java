package com.gevernova.strings.leveltwo;

import java.util.Scanner;
public class LeadingTrailingSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        int start = 0, end = input.length() - 1;
        StringBuilder trimmedString = new StringBuilder();
        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }
        for (int i = start; i <= end; i++) {
            trimmedString.append(input.charAt(i));
        }
        System.out.println("Original String: [" + input + "]");
        System.out.println("Trimmed String: [" + trimmedString.toString() + "]");
    }
}
