package com.gevernova.inheritance.hybridinheritance.vehiclesystem;

// Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric Vehicle is being charged.");
    }
}
