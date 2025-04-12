package com.gevernova.inheritance.hybridinheritance.restaurantsystem;

// Superclass: Person
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
