package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
