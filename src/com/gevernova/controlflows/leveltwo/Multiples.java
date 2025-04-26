package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Taking input and validating if it's a positive integer
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a positive integer.");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (number <= 0);


        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
