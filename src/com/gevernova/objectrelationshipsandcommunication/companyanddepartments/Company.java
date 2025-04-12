package com.gevernova.objectrelationshipsandcommunication.companyanddepartments;

import java.util.ArrayList;
import java.util.List;

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
