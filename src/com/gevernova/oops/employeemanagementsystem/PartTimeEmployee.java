package com.gevernova.oops.employeemanagementsystem;

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment() {
        department = "Support";
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
