package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h")
        );

        // Flatten the list using flatMap
        List<String> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        // Print the flattened list
        System.out.println(flattenedList);
    }
}
