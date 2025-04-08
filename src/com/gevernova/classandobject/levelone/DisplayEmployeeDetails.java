package com.gevernova.classandobject.levelone;

import java.util.Scanner;

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

public class DisplayEmployeeDetails {
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating an Employee object
        Employee employee = new Employee();

        // Taking input from user
        System.out.print("Enter Employee Name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        employee.id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        employee.salary = sc.nextInt();

        // Displaying the entered employee details
        System.out.println("\n--- Employee Details ---");
        employee.display();
    }
}
