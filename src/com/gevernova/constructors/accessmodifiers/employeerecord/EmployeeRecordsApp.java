package com.gevernova.constructors.accessmodifiers.employeerecord;

// Main class
public class EmployeeRecordsApp {
    public static void main(String[] args) {
        // Creating Employee object
        Employee employee = new Employee(1001, "IT", 55000.0);
        employee.displayInfo();

        // Modifying salary
        employee.setSalary(60000.0);
        System.out.println("Updated Salary: $" + employee.getSalary());

        System.out.println();

        // Creating Manager object
        Manager mgr = new Manager(2001, "HR", 75000.0, "HR Head");
        mgr.displayManagerInfo();
    }
}

