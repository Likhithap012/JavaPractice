package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class SumOfNumbersUsingWhile {
    public static void main(String[] args) {
        double total = 0.0;
        double number;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();
            if (number == 0 || number<0) {
                break;
            }
            total += number;
        }
        System.out.println("Total sum: " + total);
    }
}
