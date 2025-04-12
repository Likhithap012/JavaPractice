package com.gevernova.designprinciples.schoolresults;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Subject objects
        Subject subject1 = new Subject("Maths", 90);
        Subject subject2 = new Subject("Science", 85);

        // Adding subjects to a list
        List<Subject> subjects = Arrays.asList(subject1, subject2);

        // Creating a Student object
        Student student = new Student("John", 101, subjects);

        // Displaying object snapshot
        System.out.println("===== Object Diagram Snapshot =====");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Subjects and Marks:");
        for (Subject sub : student.getSubjects()) {
            System.out.println(" - " + sub.getName() + ": " + sub.getMarks());
        }
    }
}
