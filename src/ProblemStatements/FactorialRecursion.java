package ProblemStatements;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = getInput();
        long result = factorial(num);
        displayResult(num, result);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }
}

