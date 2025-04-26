package com.gevernova.staticthisfinalinstanceof;

public class UniversityStudentManagement {

    static class Student {
        // Static variable shared by all students
        static String universityName = "Global University";
        static int totalStudents = 0;

        // Instance variables
        final int rollNumber;      // final: cannot be changed
        String name;
        char grade;

        // Constructor using 'this' to resolve ambiguity
        public Student(int rollNumber, String name, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
            totalStudents++; // Increment count whenever a student is created
        }

        // Static method to display total students
        public static void displayTotalStudents() {
            System.out.println("Total Enrolled Students: " + totalStudents);
        }

        // Method to display student details
        public void displayStudentDetails() {
            if (this instanceof Student) {
                System.out.println("University   : " + universityName);
                System.out.println("Roll Number  : " + rollNumber);
                System.out.println("Name         : " + name);
                System.out.println("Grade        : " + grade);
            } else {
                System.out.println("Invalid Student");
            }
        }

        // Method to update grade
        public void updateGrade(char newGrade) {
            if (this instanceof Student) {
                this.grade = newGrade;
                System.out.println("Grade updated to " + grade + " for " + name);
            } else {
                System.out.println("Invalid operation. Not a student object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating Student objects
        Object objectOne = new Student(101, "Ananya Sharma", 'A');
        Object objectTwo = "This is not a student";

        // Using instanceof to check before casting and displaying details
        if (objectOne instanceof Student) {
            ((Student) objectOne).displayStudentDetails();
        } else {
            System.out.println("obj1 is not a student.");
        }

        System.out.println();

        if (objectTwo instanceof Student) {
            ((Student) objectTwo).displayStudentDetails();
        } else {
            System.out.println("obj2 is not a student.");
        }

        // Display total students
        System.out.println();
        Student.displayTotalStudents();
    }
}

