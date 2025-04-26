package com.gevernova.practice;

import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int base= scanner.nextInt();
        int exponent= scanner.nextInt();
        System.out.println(Math.pow(base,exponent));
    }
}
