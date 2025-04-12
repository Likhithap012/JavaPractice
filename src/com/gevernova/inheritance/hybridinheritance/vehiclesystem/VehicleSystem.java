package com.gevernova.inheritance.hybridinheritance.vehiclesystem;

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

