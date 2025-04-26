package com.gevernova.problemstatements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double numberOne = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double numberTwo = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = performOperation(numberOne, numberTwo, operator);
        System.out.println("Result: " + result);
    }

    public static double performOperation(double numberOne, double numberTwo, char operator) {
        switch (operator) {
            case '+': return add(numberOne, numberTwo);
            case '-': return subtract(numberOne, numberTwo);
            case '*': return multiply(numberOne, numberTwo);
            case '/': return divide(numberOne, numberTwo);
            default: return 0;
        }
    }

    public static double add(double numberOne, double numberTwo) { return numberOne + numberTwo; }
    public static double subtract(double numberOne, double numberTwo) { return numberOne - numberTwo; }
    public static double multiply(double numberOne, double numberTwo) { return numberOne * numberTwo; }
    public static double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return numberOne / numberTwo;
    }
}

