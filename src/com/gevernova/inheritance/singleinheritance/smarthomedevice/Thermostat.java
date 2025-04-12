package com.gevernova.inheritance.singleinheritance.smarthomedevice;

// Subclass: Specific thermostat device
class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // optional, reuses the parent display
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
