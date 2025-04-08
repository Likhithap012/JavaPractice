package com.gevernova.practice;

import java.util.Scanner;
public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kilometers=sc.nextInt();
        double Miles = kilometers * 0.621371;
        System.out.println(Miles);
    }
}
