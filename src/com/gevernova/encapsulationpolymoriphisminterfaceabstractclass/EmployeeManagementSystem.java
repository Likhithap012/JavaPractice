package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

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
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}

// Interface
interface Department {
    void assignDepartment();
    void getDepartmentDetails();
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment() {
        department = "Development";
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment() {
        department = "Support";
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Full-Time Employee
        FullTimeEmployee fullTime = new FullTimeEmployee(1, "Alice", 500.0, 8);
        fullTime.assignDepartment();
        fullTime.displayDetails();
        fullTime.getDepartmentDetails();

        System.out.println("-----------------------");

        // Part-Time Employee
        PartTimeEmployee partTime = new PartTimeEmployee(2, "Bob", 300.0, 4);
        partTime.assignDepartment();
        partTime.displayDetails();
        partTime.getDepartmentDetails();
    }
}
