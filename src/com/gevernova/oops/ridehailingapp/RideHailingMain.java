package com.gevernova.oops.ridehailingapp;

// Main class with unique name
class RideHailingMain {
    public static void processRide(RideVehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Estimated Fare: ₹" + vehicle.calculateFare(distance));

        if (vehicle instanceof RideGPS) {
            System.out.println("Current Location: " + ((RideGPS) vehicle).getCurrentLocation());
        }

        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        RideCar car = new RideCar(101, "Arjun", 15.0, "MG Road");
        RideBike bike = new RideBike(102, "Neha", 8.0, "BTM Layout");
        RideAuto auto = new RideAuto(103, "Ravi", 10.0, "Indiranagar");

        processRide(car, 10.5);
        processRide(bike, 5.2);
        processRide(auto, 7.8);
    }
}
