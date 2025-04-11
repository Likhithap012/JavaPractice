package com.gevernova.inheritance.hybridinheritance;

// Superclass: Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: PetrolVehicle (inherits from Vehicle and implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle is being refueled.");
    }
}

// Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric Vehicle is being charged.");
    }
}

// Main Class
public class VehicleSystem {
    public static void main(String[] args) {
        PetrolVehicle petrolCar = new PetrolVehicle("Honda City", 180);
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model 3", 250);

        System.out.println("--- Petrol Vehicle ---");
        petrolCar.displayInfo();
        petrolCar.refuel();

        System.out.println("\n--- Electric Vehicle ---");
        electricCar.displayInfo();
        electricCar.charge();
    }
}

