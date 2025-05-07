package com.gevernova.regex;

import java.util.regex.*;
import java.util.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regex pattern with the languages
        String regex = "\\b(JavaScript|Java|Python|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> foundLanguages = new ArrayList<>();
        while (matcher.find()) {
            foundLanguages.add(matcher.group());
        }

        // Output the result
        System.out.println(String.join(", ", foundLanguages));
    }
}
