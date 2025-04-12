package com.gevernova.classandobject.levelone.displayemployeedetails;

// Employee class with attributes and a method to display details
class Employee {
    String name;
    int id;
    int salary;

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: " + this.salary);
    }
}
