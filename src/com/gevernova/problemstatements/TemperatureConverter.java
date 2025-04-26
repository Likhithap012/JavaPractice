package com.gevernova.problemstatements;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert to (1) Celsius or (2) Fahrenheit? ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("In Celsius: " + toCelsius(temp));
        } else {
            System.out.println("In Fahrenheit: " + toFahrenheit(temp));
        }
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}

