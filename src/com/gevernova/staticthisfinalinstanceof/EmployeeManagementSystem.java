package com.gevernova.staticthisfinalinstanceof;
// Employee class
class Employee {

    // Static variable shared by all employees
    static String companyName = "TechNova Solutions";

    // Static variable to count total employees
    static int totalEmployees = 0;

    // Instance variables
    String name;
    final int id; // final: cannot be changed once assigned
    String designation;

    // Constructor using 'this' to initialize variables
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment when new employee is created
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details using instanceof
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company     : " + companyName);
            System.out.println("Employee ID : " + id);
            System.out.println("Name        : " + name);
            System.out.println("Designation : " + designation);
        } else {
            System.out.println("Invalid Employee object");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");

        // Display each employee's details
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        System.out.println();

        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}

