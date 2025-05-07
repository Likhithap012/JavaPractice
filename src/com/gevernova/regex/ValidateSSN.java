package com.gevernova.regex;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String input = "My SSN is 123-45-6789.";

        // SSN pattern
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println( matcher.group() + "\" is valid");
        }

        // Optional check for invalid case
        if (!matcher.find()) {
            System.out.println(" No valid SSN found.");
        }
    }
}
