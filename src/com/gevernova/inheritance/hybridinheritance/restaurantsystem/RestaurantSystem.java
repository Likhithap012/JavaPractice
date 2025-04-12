package com.gevernova.inheritance.hybridinheritance.restaurantsystem;

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

