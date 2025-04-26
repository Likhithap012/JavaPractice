package com.gevernova.problemstatements;
import java.util.Scanner;

public class MaximumofThreeNumbers {
    public static void main(String[] args) {
        int numberOne = getInput("Enter first number: ");
        int numberTwo = getInput("Enter second number: ");
        int numberThree = getInput("Enter third number: ");

        int maximum = findMaximum(numberOne, numberTwo, numberThree);

        System.out.println("The maximum number is: " + maximum);
    }
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int findMaximum(int numberOne, int numberTwo, int numberThree) {
        int maximum = numberOne;
        if (numberTwo > maximum) {
            maximum = numberTwo;
        }
        if (numberThree > maximum) {
            maximum = numberThree;
        }
        return maximum;
    }
}
