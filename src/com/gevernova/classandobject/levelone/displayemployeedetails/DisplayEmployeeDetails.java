package com.gevernova.classandobject.levelone.displayemployeedetails;

import java.util.Scanner;

public class DisplayEmployeeDetails {
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating an Employee object
        Employee employee = new Employee();

        // Taking input from user
        System.out.print("Enter Employee Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        employee.id = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        employee.salary = scanner.nextInt();

        // Displaying the entered employee details
        System.out.println("\n--- Employee Details ---");
        employee.display();
    }
}
