package com.gevernova.inheritance.hybridinheritance.vehiclesystem;

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
