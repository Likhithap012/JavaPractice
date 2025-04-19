package com.gevernova.recursions;

public class Fibonacci {
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case 1
        } else if (n == 1) {
            return 1; // Base case 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    // Main method to test the fibonacci method
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
