package com.gevernova.dsa.timeandspacecomplexity;

public class FibonacciComparison {

    // Recursive approach to compute Fibonacci (O(2^n))
    public static int fibonacciRecursive(int number) {
        if (number <= 1) return number;
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    // Iterative approach to compute Fibonacci (O(N))
    public static int fibonacciIterative(int number) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= number; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // Method to measure and compare the performance of both approaches
    public static void compareFibonacciPerformance(int n) {
        // Measure time for Recursive approach
        long startRec = System.nanoTime();
        int resultRec = fibonacciRecursive(n);
        long endRec = System.nanoTime();
        long recursiveTime = endRec - startRec;

        // Measure time for Iterative approach
        long startIter = System.nanoTime();
        int resultIter = fibonacciIterative(n);
        long endIter = System.nanoTime();
        long iterativeTime = endIter - startIter;

        // Output the performance results
        System.out.println("Recursive Fibonacci (n = " + n + ") Time: " + (recursiveTime / 1000000.0) + " ms");
        System.out.println("Iterative Fibonacci (n = " + n + ") Time: " + (iterativeTime / 1000000.0) + " ms");
    }

    public static void main(String[] args) {
        // Example Fibonacci numbers for comparison
        int[] testValues = {10, 30, 50};

        // Compare performance for each test value
        for (int n : testValues) {
            compareFibonacciPerformance(n);
        }
    }
}

