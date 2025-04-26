package com.gevernova.staticthisfinalinstanceof;

public class VehicleRegistrationSystem {

    static class Vehicle {
        // Static variable shared among all vehicles
        static int registrationFee = 500;

        // Instance variables
        String ownerName;
        String vehicleType;
        final String registrationNumber; // Final - cannot be changed

        // Constructor using 'this' keyword
        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }

        // Static method to update the registration fee
        public static void updateRegistrationFee(int newFee) {
            registrationFee = newFee;
        }

        // Method to display vehicle details
        public void displayVehicleDetails() {
            if (this instanceof Vehicle) {
                System.out.println("Owner Name          : " + ownerName);
                System.out.println("Vehicle Type        : " + vehicleType);
                System.out.println("Registration Number : " + registrationNumber);
                System.out.println("Registration Fee    : ₹" + registrationFee);
            } else {
                System.out.println("Invalid Vehicle Object");
            }
        }
    }

    public static void main(String[] args) {
        // Create Vehicle objects
        Object vehicleOne = new Vehicle("Aarav Kumar", "Car", "MH12AB1234");
        Object vehicleTwo = new Vehicle("Neha Verma", "Scooter", "DL05CD5678");
        Object vehicleThree = "Not a vehicle";

        // Display details only if the object is an instance of Vehicle
        if (vehicleOne instanceof Vehicle) {
            ((Vehicle) vehicleOne).displayVehicleDetails();
        } else {
            System.out.println("v1 is not a Vehicle");
        }

        System.out.println();

        if (vehicleTwo instanceof Vehicle) {
            ((Vehicle) vehicleTwo).displayVehicleDetails();
        } else {
            System.out.println("v2 is not a Vehicle");
        }

        System.out.println();

        if (vehicleThree instanceof Vehicle) {
            ((Vehicle) vehicleThree).displayVehicleDetails();
        } else {
            System.out.println("v3 is not a Vehicle");
        }

        // Update registration fee
        System.out.println("\nUpdating Registration Fee...\n");
        Vehicle.updateRegistrationFee(650);

        // Display updated details
        if (vehicleOne instanceof Vehicle) {
            ((Vehicle) vehicleOne).displayVehicleDetails();
        }
    }
}

