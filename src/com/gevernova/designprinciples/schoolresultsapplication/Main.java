package com.gevernova.designprinciples.schoolresultsapplication;

import java.util.Arrays;
import java.util.List;

// Main class to demonstrate the Student-Subject-GradeCalculator system
public class Main {
    public static void main(String[] args) {
        // Create a list of subjects with their marks
        List<Subject> subjects = Arrays.asList(
                new Subject("Math", 85),
                new Subject("Science", 92),
                new Subject("English", 78)
        );

        // Create a student with the above subject list
        Student student = new Student("Alice", 101, subjects);

        // Create an instance of GradeCalculator to evaluate the grade
        GradeCalculator calculator = new GradeCalculator();

        // Calculate and display grade
        String grade = calculator.calculateGrade(student);

        // Display student details and final grade
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Final Grade: " + grade);
    }
}

