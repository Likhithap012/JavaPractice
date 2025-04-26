package com.gevernova.collections.map;

import java.util.*;
import java.util.regex.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freq = new HashMap<>();
        text = text.toLowerCase(); // Ignore case
        text = text.replaceAll("[^a-z\\s]", ""); // Remove punctuation

        for (String word : text.split("\\s+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input)); // Output: {hello=2, world=1, java=1}
    }
}

