package com.gevernova.problemstatements;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorial(number - 1);
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

