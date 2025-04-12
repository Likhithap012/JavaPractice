package com.gevernova.oops.ridehailingapp;

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
