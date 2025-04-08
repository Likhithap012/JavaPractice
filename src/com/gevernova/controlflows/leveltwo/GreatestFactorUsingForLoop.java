package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;
public class GreatestFactorUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                greatestFactor = i; // Update greatest factor
            }
        }
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

    }
}
