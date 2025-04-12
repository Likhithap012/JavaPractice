package com.gevernova.constructors.accessmodifiers.employeerecord;

// Main class
public class EmployeeRecordsApp {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee(1001, "IT", 55000.0);
        emp.displayInfo();

        // Modifying salary
        emp.setSalary(60000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        System.out.println();

        // Creating Manager object
        Manager mgr = new Manager(2001, "HR", 75000.0, "HR Head");
        mgr.displayManagerInfo();
    }
}

