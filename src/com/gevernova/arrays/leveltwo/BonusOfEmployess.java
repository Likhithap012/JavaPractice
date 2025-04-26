package com.gevernova.arrays.leveltwo;

import java.util.Scanner;
public class BonusOfEmployess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        int[] yearsOfService = new int[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < EMPLOYEES; i++) {
            while (true) {
                System.out.print("Salary: ");
                salary[i] = scanner.nextDouble();
                if (salary[i] > 0) break;
                System.out.println("Invalid input! Salary must be greater than 0. Try again.");
            }
            while (true) {
                System.out.print("Years of Service: ");
                yearsOfService[i] = scanner.nextInt();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid input! Years of service cannot be negative. Try again.");
            }
        }
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
            for (int i = 0; i < EMPLOYEES; i++) {
                System.out.println((i + 1) + "          " + salary[i] + "          " + yearsOfService[i] + "               " + bonus[i] + "          " + newSalary[i]);
            }

        System.out.println(totalOldSalary);
        System.out.println( totalBonus);
        System.out.println(totalNewSalary);
    }
}
