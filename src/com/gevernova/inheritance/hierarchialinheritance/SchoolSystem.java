package com.gevernova.inheritance.hierarchialinheritance;

// Superclass: Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

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

// Subclass: Staff
class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Sharma", 40, "Mathematics");
        Student student = new Student("Ananya", 15, "10th Grade");
        Staff staff = new Staff("Mr. Raj", 35, "Administration");

        System.out.println("--- Teacher ---");
        teacher.displayBasicInfo();
        teacher.displayRole();

        System.out.println("\n--- Student ---");
        student.displayBasicInfo();
        student.displayRole();

        System.out.println("\n--- Staff ---");
        staff.displayBasicInfo();
        staff.displayRole();
    }
}

