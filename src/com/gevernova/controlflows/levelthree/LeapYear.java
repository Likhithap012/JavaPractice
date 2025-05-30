package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int year= scanner.nextInt();
        if (year < 1582) {
            System.out.println("Invalid input! The program works only for years >= 1582.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
