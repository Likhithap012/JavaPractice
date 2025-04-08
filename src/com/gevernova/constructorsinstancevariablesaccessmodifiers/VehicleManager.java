package com.gevernova.constructorsinstancevariablesaccessmodifiers;


// Class representing a Vehicle
class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared among all vehicles)
    static int registrationFee = 2000;

    // Constructor to initialize the vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println();
    }

    // Class method to update registration fee
    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }
}

public class VehicleManager {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Likhitha", "Car");
        Vehicle v2 = new Vehicle("vyshnavi", "Bike");

        // Display initial vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(2500);

        // Display updated vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

