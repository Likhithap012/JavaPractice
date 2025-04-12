package com.gevernova.oops.ridehailingapp;

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

