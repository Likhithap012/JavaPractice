package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (non-negative integer): ");
        int exponent = scanner.nextInt();
        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
        } else {
            long result = 1;
            int count = 0;
            while (count < exponent) {
                result *= base;
                count++;
            }
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }

        scanner.close();
    }
}
