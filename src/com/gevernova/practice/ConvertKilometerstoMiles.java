package com.gevernova.practice;

import java.util.Scanner;
public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int kilometers= scanner.nextInt();
        double Miles = kilometers * 0.621371;
        System.out.println(Miles);
    }
}
