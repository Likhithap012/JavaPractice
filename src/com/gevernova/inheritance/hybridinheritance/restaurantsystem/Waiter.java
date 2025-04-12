package com.gevernova.inheritance.hybridinheritance.restaurantsystem;

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
