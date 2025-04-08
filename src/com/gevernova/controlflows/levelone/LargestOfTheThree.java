package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class LargestOfTheThree {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Is the first number the largest? true");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? false");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? true");
            System.out.println("Is the third number the largest? false");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("There is no single largest number (some numbers may be equal).");
        }

    }
}
