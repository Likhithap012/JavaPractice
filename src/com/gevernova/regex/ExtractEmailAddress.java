package com.gevernova.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for more info.";

        // Regex to extract email addresses
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Email Addresses:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }}
