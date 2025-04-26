package com.gevernova.classandobject.leveltwo.studentreport;

import java.util.Scanner;


public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Student object
        Student student = new Student();

        // Input student details
        System.out.print("Enter Student Name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        student.rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        student.marks = scanner.nextDouble();

        // Display the student's information and grade
        System.out.println("\n--- Student Details ---");
        student.displayDetails();
    }
}
