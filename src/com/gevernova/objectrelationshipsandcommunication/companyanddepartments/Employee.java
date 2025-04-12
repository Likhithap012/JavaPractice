package com.gevernova.objectrelationshipsandcommunication.companyanddepartments;

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
