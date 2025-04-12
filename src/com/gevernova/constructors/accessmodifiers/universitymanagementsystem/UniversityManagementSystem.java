package com.gevernova.constructors.accessmodifiers.universitymanagementsystem;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student student1 = new Student(101, "Likhitha", 9.2);
        student1.displayDetails();

        // Update CGPA using setter
        student1.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "vyshnavi", 8.8);
        pgStudent.displayDetails();
        pgStudent.showName(); // Accessing protected name
    }
}

