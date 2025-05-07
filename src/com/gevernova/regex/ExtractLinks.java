package com.gevernova.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ExtractLinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Regex to match URLs starting with http or https
        Pattern pattern = Pattern.compile("\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Extracted Links:");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}
