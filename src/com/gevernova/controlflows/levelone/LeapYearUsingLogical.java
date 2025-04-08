package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class LeapYearUsingLogical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This is LeapYear");
        }
        else{
            System.out.println("This is not a LeapYear");
        }
    }
}
