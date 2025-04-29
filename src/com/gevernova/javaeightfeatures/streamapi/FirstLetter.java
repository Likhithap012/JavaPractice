package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "avocado");

        // Grouping by first character
        Map<Character, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        // Print the result
        groupedWords.forEach((letter, wordList) ->
                System.out.println(letter + " -> " + wordList)
        );
    }
}
