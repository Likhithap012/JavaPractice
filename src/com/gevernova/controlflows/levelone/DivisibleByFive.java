package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("The number " + number + " divisible by 5");
        } else {
            System.out.println("The number " + number + " is not divisible by 5");
        }
    }
}
