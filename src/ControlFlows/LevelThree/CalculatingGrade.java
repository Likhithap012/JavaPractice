package ControlFlows.LevelThree;
import java.util.*;
public class CalculatingGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Invalid marks entered! Please enter marks between 0 and 100.");
        } else {
            int totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 3.0);
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else if (percentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}
