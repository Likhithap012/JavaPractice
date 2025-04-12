package com.gevernova.inheritance.assignedproblems.vehicletransportsystem;

class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(int maxSpeed, String fuelType, double payloadCapacity) {
        super(maxSpeed, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}
