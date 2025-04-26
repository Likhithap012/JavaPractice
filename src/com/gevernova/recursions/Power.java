package com.gevernova.recursions;

public class Power {
    // Recursive method to compute a^b
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: a^0 = 1
        }
        return base * power(base, exponent - 1); // Recursive case
    }

    public static void main(String[] args) {
        int base = 2, exponent = 5;
        System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
    }
}
