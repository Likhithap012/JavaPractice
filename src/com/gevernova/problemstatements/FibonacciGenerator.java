package com.gevernova.problemstatements;
import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        printFibonacci(terms);
    }

    public static void printFibonacci(int number) {
        int a = 0, b = 1;
        for (int i = 1; i <= number; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
