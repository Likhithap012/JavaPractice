package com.gevernova.exceptionalhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user to enter two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");

        } finally {
            scanner.close(); // Always close the scanner
            System.out.println("Program ended.");
        }
    }
}
