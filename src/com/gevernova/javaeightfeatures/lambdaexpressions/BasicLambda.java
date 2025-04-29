package com.gevernova.javaeightfeatures.lambdaexpressions;

import java.util.function.Predicate; // Predicate is a functional interface that takes one input and returns boolean

public class BasicLambda {
    public static void main(String[] args) {
        // Lambda to check if a number is even
        Predicate<Integer> predicate = (x) -> x % 2 == 0;

        System.out.println(predicate.test(2)); // true (because 2 is even)
        System.out.println(predicate.test(1)); // false (because 1 is odd)

        // Lambda to check if a string is empty
        Predicate<String> predicatestring = x -> x.length() == 0;

        System.out.println(predicatestring.test(""));         // true (empty string)
        System.out.println(predicatestring.test("likhitha")); // false (not empty)
    }
}
