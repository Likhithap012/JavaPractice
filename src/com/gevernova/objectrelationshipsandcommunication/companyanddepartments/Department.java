package com.gevernova.objectrelationshipsandcommunication.companyanddepartments;

import java.util.ArrayList;
import java.util.List;

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

