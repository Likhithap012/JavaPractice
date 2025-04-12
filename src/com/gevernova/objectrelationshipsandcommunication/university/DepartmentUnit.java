package com.gevernova.objectrelationshipsandcommunication.university;

// Department class (Composition - tied to University)
class DepartmentUnit {
    String deptName;

    DepartmentUnit(String deptName) {
        this.deptName = deptName;
    }

    void displayInfo() {
        System.out.println("Department: " + deptName);
    }
}
