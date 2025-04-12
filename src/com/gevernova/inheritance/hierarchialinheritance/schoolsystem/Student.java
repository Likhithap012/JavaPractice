package com.gevernova.inheritance.hierarchialinheritance.schoolsystem;

// Subclass: Student
class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
