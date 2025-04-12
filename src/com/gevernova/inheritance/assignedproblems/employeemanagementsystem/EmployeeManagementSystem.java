package com.gevernova.inheritance.assignedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Likhitha", 101, 90000.0, 5);
        Employee developer = new Developer("likhitha", 102, 70000.0, "Java");
        Employee intern = new Intern("vyshnavi", 103, 20000.0, "JNTU");

        System.out.println("----- Manager Details -----");
        manager.displayDetails();

        System.out.println("\n----- Developer Details -----");
        developer.displayDetails();

        System.out.println("\n----- Intern Details -----");
        intern.displayDetails();
    }
}
