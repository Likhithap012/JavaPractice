package com.gevernova.recursions;

public class Fibonacci {
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0; // Base case 1
        } else if (number == 1) {
            return 1; // Base case 2
        }
        return fibonacci(number - 1) + fibonacci(number - 2); // Recursive case
    }

    // Main method to test the fibonacci method
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Fibonacci number at position " + number + " is: " + fibonacci(number));
    }
}
