package com.gevernova.inheritance.assignedproblems.vehicletransportsystem;


public class VehicleTransportSystem {
    public static void main(String[] args) {
        // Polymorphism: Array of Vehicle types holding different objects
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", false);

        // Display info for all vehicles
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("----------------------------");
        }
    }
}
