package com.gevernova.inheritance.hierarchialinheritance.schoolsystem;

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
