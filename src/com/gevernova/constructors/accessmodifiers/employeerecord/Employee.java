package com.gevernova.constructors.accessmodifiers.employeerecord;

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
