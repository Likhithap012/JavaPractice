package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("The number " + a + " divisible by 5");
        } else {
            System.out.println("The number " + a + " is not divisible by 5");
        }
    }
}
