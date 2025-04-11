package com.gevernova.inheritance.hybridinheritance;

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

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Preparing meals, managing kitchen staff.");
    }
}

// Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Taking orders, serving food, and attending customers.");
    }
}

// Main Class
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Arjun", 101);
        Waiter waiter = new Waiter("Neha", 202);

        System.out.println("--- Chef Details ---");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n--- Waiter Details ---");
        waiter.displayInfo();
        waiter.performDuties();
    }
}

