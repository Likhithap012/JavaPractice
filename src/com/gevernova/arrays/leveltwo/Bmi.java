package com.gevernova.arrays.leveltwo;

import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "  |  " + weight[i] + "  |  " + String.format("%.2f", bmi[i]) + "  |  " + status[i]);
        }
    }
}
