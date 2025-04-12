package com.gevernova.constructors.instanceandclassvariables.vehicleregistration;


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

