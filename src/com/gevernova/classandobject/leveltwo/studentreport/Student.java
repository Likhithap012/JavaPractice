package com.gevernova.classandobject.leveltwo.studentreport;

class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
