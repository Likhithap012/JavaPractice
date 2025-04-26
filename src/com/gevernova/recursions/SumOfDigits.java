package com.gevernova.recursions;

public class SumOfDigits {
    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0; // Base case
        }
        return (number % 10) + sumOfDigits(number / 10); // Recursive case
    }

    // Main method to test the sumOfDigits method
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}
