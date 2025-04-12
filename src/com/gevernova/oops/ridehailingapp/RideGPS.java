package com.gevernova.oops.ridehailingapp;

// Interface with a unique name
interface RideGPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
