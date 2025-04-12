package com.gevernova.inheritance.hierarchialinheritance.schoolsystem;

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

