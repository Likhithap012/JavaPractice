package com.gevernova.staticthisfinalinstanceof.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employeeOne = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee employeeTwo = new Employee("Bob Smith", 102, "Project Manager");

        // Display each employee's details
        if (employeeOne instanceof Employee) {
            employeeOne.displayEmployeeDetails();
        }

        System.out.println();

        if (employeeTwo instanceof Employee) {
            employeeTwo.displayEmployeeDetails();
        }

        System.out.println();

        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}

