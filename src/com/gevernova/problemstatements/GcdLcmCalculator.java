package com.gevernova.problemstatements;

import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        int[] numberss = getInput();
        int gcd = findGCD(numberss[0], numberss[1]);
        int lcm = findLCM(numberss[0], numberss[1], gcd);
        displayResults(numberss[0], numberss[1], gcd, lcm);
    }

    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = scanner.nextInt();
        return new int[]{numberOne, numberTwo};
    }

    public static int findGCD(int numberOne, int numberTwo) {
        if (numberTwo == 0) return numberOne;
        return findGCD(numberTwo, numberOne % numberTwo);
    }

    public static int findLCM(int numberOne, int numberTwo, int gcd) {
        return (numberOne * numberTwo) / gcd;
    }

    public static void displayResults(int numberOne, int numberTwo, int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}

