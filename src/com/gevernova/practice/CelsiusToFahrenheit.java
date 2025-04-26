package com.gevernova.practice;

import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int Celsius = scanner.nextInt();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}
