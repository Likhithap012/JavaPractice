package Strings.LevelTwo;

import java.util.Scanner;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nEnter marks for Student " + i);
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            System.out.print("Math: ");
            int math = scanner.nextInt();
            int total = physics + chemistry + math;
            double percentage = total / 3.0;
            String grade = calculateGrade(percentage);
            System.out.println("\nStudent " + i + " Result:");
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }
        scanner.close();
    }
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F"; // Fail
    }
}
