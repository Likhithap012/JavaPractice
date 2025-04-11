package com.gevernova.problemstatements;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        int[] nums = getInput();
        int gcd = findGCD(nums[0], nums[1]);
        int lcm = findLCM(nums[0], nums[1], gcd);
        displayResults(nums[0], nums[1], gcd, lcm);
    }

    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        return new int[]{a, b};
    }

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}

