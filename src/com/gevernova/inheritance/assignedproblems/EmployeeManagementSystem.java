package com.gevernova.inheritance.assignedproblems;

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String university;

    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

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
