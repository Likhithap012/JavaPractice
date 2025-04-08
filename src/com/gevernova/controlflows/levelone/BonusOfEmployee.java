package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary= sc.nextInt();
        int year= sc.nextInt();
        if (year > 5) {
            double bonus = 0.05 * salary; // 5% of salary
            System.out.printf("The employee is eligible for a bonus of: %.2f%n", bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
