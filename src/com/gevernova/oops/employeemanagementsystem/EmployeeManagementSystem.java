package com.gevernova.oops.employeemanagementsystem;

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
