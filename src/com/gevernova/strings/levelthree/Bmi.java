package com.gevernova.strings.levelthree;

import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter height (in meters): ");
            double height = scanner.nextDouble();
            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            double bmi = Math.round((weight / (height * height)) * 100.0) / 100.0;
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            System.out.println("Name: " + name + ", Height: " + height + "m, Weight: " + weight + "kg, BMI: " + bmi + ", Status: " + status);
        }
    }
}
