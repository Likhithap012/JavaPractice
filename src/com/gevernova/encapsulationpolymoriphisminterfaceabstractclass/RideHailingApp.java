package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

// Abstract class with a unique name
abstract class RideVehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: ₹" + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

// Interface with a unique name
interface RideGPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Subclass for car rides
class RideCar extends RideVehicle implements RideGPS {
    private String currentLocation;

    public RideCar(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass for bike rides
class RideBike extends RideVehicle implements RideGPS {
    private String currentLocation;

    public RideBike(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass for auto rides
class RideAuto extends RideVehicle implements RideGPS {
    private String currentLocation;

    public RideAuto(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

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
