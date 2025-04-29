package com.gevernova.javaeightfeatures.functionalinterface;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking dynamic input
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Define Predicate: checks if a number is even
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Define Function: squares a number
        Function<Integer, Integer> square = x -> x * x;

        // Process the list using Predicate and Function
        List<Integer> result = list.stream()
                .filter(isEven)    // Filter even numbers
                .map(square)       // Square each number
                .collect(Collectors.toList()); // Collect to a list

        System.out.println("Squared even numbers: " + result);
    }
}
