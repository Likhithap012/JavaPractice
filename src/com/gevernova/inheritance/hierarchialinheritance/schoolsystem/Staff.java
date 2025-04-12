package com.gevernova.inheritance.hierarchialinheritance.schoolsystem;

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
