package com.gevernova.inheritance.singleinheritance;

// Superclass: General device
class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

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

class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "Active", 22.5);
        thermostat.displayStatus(); // shows device ID, status, and temp
    }
}
