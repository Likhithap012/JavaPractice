package com.gevernova.staticthisfinalinstanceof.employeemanagementsystem;

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

