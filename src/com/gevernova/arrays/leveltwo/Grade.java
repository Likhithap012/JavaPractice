package com.gevernova.arrays.leveltwo;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();
        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            marks[i][0] = getValidMarks(scanner, "Physics");
            marks[i][1] = getValidMarks(scanner, "Chemistry");
            marks[i][2] = getValidMarks(scanner, "Maths");
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = getGrade(percentages[i]);
        }
        for (int i = 0; i < number; i++) {
            System.out.println(marks[i][0] + "      | " + marks[i][1] + "        | " + marks[i][2] + "    | " +
                    String.format("%.2f", percentages[i]) + "%   | " + grades[i]);
        }

        scanner.close();
    }
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        do {
            System.out.print("Enter marks for " + subject + " (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
    }

