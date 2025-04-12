package com.gevernova.oops.employeemanagementsystem;

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment() {
        department = "Development";
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
