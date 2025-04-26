package com.gevernova.recursions;

public class Factorial {
    // Recursive method to calculate factorial
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case
        }
        return number * factorial(number - 1); // Recursive case
    }

    // Main method to test the factorial method
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
