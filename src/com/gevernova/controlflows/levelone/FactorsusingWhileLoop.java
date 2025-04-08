package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class FactorsusingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
