package com.gevernova.inheritance.hybridinheritance.restaurantsystem;

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
