package com.gevernova.regex;

import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to find consecutive repeated words (case-insensitive)
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatedWords = new HashSet<>();
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        System.out.println(String.join(", ", repeatedWords));
    }
}

