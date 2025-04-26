package com.gevernova.constructors.accessmodifiers.universitymanagementsystem;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student studentOne = new Student(101, "Likhitha", 9.2);
        studentOne.displayDetails();

        // Update CGPA using setter
        studentOne.setCGPA(9.5);
        System.out.println("Updated CGPA: " + studentOne.getCGPA());

        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "vyshnavi", 8.8);
        pgStudent.displayDetails();
        pgStudent.showName(); // Accessing protected name
    }
}

