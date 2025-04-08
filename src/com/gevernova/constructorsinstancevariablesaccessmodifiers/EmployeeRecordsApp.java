package com.gevernova.constructorsinstancevariablesaccessmodifiers;

// Employee class
class Employee {
    public int employeeID;            // Public - accessible from anywhere
    protected String department;      // Protected - accessible in subclass
    private double salary;            // Private - accessible only within this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager accessing public and protected members
class Manager extends Employee {

    private String role;

    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);     // public access
        System.out.println("Department: " + department);      // protected access
        System.out.println("Role: " + role);
    }
}

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

