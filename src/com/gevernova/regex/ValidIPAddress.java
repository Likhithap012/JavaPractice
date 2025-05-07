package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Regular expression for validating an IPv4 address
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid IPv4 address.");
        } else {
            System.out.println("Invalid IPv4 address.");
        }
    }
}
