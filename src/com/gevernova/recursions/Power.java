package com.gevernova.recursions;

public class Power {
    // Recursive method to compute a^b
    public static int power(int a, int b) {
        if (b == 0) {
            return 1; // Base case: a^0 = 1
        }
        return a * power(a, b - 1); // Recursive case
    }

    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(a + " raised to the power " + b + " is: " + power(a, b));
    }
}
