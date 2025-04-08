package com.gevernova.constructorsinstancevariablesaccessmodifiers;

class Student {
    public int rollNumber;          // Public - accessible anywhere
    protected String name;          // Protected - accessible in subclass
    private double CGPA;            // Private - accessible only inside this class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Accessing protected member 'name'
    public void showName() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

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

