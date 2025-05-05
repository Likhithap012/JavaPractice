package com.gevernova.exceptionalhandling;

public class ThrowVsThrows {
    // Method that may throw an exception → declared with 'throws'
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // Manually throw an exception → using 'throw'
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            double interest = calculateInterest(5000, -3.5, 2);  // Invalid rate
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
