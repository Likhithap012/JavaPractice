package com.gevernova.methods.levelone;

import java.util.*;

public class SimpleInterest {

    // This method calculates simple interest using the formula (P * R * T) / 100
    public static int simpleInterest(int p, int r, int t) {
        int simple_interest = (p * r * t) / 100;
        return simple_interest; // Returns the calculated simple interest
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Taking principle, rate, and time as input from the user
        int principle = scanner.nextInt();
        int rate = scanner.nextInt();
        int time = scanner.nextInt();

        // Calling the simpleInterest method with the user inputs
        int result = simpleInterest(principle, rate, time);

        // Printing the result to the console
        System.out.println(result);
    }
}
