package com.gevernova.oops.employeemanagementsystem;

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
