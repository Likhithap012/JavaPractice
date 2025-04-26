package com.gevernova.designprinciples.schoolresults;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Subject objects
        Subject subjectOne = new Subject("Maths", 90);
        Subject subjectTwo = new Subject("Science", 85);

        // Adding subjects to a list
        List<Subject> subjects = Arrays.asList(subjectOne, subjectTwo);

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
