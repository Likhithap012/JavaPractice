package com.gevernova.constructors.instanceandclassvariables.vehicleregistration;

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
