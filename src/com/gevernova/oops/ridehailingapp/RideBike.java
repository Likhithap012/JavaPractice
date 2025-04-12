package com.gevernova.oops.ridehailingapp;

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
