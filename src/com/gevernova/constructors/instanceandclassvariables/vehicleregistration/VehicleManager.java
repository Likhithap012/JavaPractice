package com.gevernova.constructors.instanceandclassvariables.vehicleregistration;


public class VehicleManager {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicleOne = new Vehicle("Likhitha", "Car");
        Vehicle vehicleTwo = new Vehicle("vyshnavi", "Bike");

        // Display initial vehicle details
        vehicleOne.displayVehicleDetails();
        vehicleTwo.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(2500);

        // Display updated vehicle details
        vehicleOne.displayVehicleDetails();
        vehicleTwo.displayVehicleDetails();
    }
}

