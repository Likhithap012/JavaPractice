package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showDetails() {
        System.out.println("Employee: " + name);
    }
}

// Department class (part of Company)
class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        Employee emp = new Employee(empName);
        employees.add(emp);
    }

    void showDepartmentDetails() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}

// Company class (composes Departments and indirectly Employees)
class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.deptName.equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showDepartmentDetails();
        }
    }

    void deleteCompany() {
        departments.clear();  // all departments and employees go out of scope
        System.out.println(companyName + " and all its departments and employees have been deleted.");
    }
}

// Main class
 class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        Department itDept = company.getDepartment("IT");
        itDept.addEmployee("Likhitha");
        itDept.addEmployee("Ananya");

        Department hrDept = company.getDepartment("HR");
        hrDept.addEmployee("Ravi");

        // Show all details
        company.showCompanyDetails();

        System.out.println("\nDeleting company...\n");

        // Delete the company
        company.deleteCompany();
    }
}
