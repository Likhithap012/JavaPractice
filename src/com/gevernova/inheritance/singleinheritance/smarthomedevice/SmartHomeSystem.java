package com.gevernova.inheritance.singleinheritance.smarthomedevice;

class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "Active", 22.5);
        thermostat.displayStatus(); // shows device ID, status, and temp
    }
}
