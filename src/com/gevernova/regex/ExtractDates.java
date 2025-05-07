package com.gevernova.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ExtractDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Regex to match dd/mm/yyyy format
        Pattern pattern = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Extracted Dates:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
