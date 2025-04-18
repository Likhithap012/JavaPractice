package com.gevernova.problemstatements;
import java.util.Scanner;

public class MaximumofThreeNumbers {
    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");

        int max = findMaximum(num1, num2, num3);

        System.out.println("The maximum number is: " + max);
    }
    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
