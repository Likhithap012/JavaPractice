package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class LargestOfTheThree {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double numberOne = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double numberTwo = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double numberThree = scanner.nextDouble();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Is the first number the largest? true");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? false");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? true");
            System.out.println("Is the third number the largest? false");
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("There is no single largest number (some numbers may be equal).");
        }

    }
}
