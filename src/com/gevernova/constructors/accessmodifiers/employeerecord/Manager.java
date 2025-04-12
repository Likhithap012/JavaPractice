package com.gevernova.constructors.accessmodifiers.employeerecord;

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
