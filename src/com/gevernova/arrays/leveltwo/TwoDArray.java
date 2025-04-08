package com.gevernova.arrays.leveltwo;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        final int SUBJECTS = 3;
        final int STUDENTS = 5;
        int[][] marks = new int[STUDENTS][SUBJECTS];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for " + STUDENTS + " students in Physics, Chemistry, and Mathematics:");
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print("Enter marks in Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < STUDENTS; i++) {
            int total = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                total += marks[i][j];
            }
            float percentage = (float) total / SUBJECTS;

            char grade;
            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 80)
                grade = 'B';
            else if (percentage >= 70)
                grade = 'C';
            else if (percentage >= 60)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + (i + 1) + " - Total: " + total + ", Percentage: " + percentage + "%, Grade: " + grade);
        }

    }
}
