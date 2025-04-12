package com.gevernova.oops.vehiclerentalsystem;

// Truck class
class Truck extends Vehicle implements Insurable {
    int insurance;

    public Truck(int vehicleNumber, String type, Double rentalRate, int insurance) {
        super(vehicleNumber, type, rentalRate);
        this.insurance = insurance;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public int calculateInsurance() {
        insurance = insurance * 5;
        return insurance;
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: " + insurance);
    }
}
