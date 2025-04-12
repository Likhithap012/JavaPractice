package com.gevernova.oops.vehiclerentalsystem;

// Bike class
class Bike extends Vehicle implements Insurable {
    int insurance;

    public Bike(int vehicleNumber, String type, Double rentalRate, int insurance) {
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
        System.out.println("Bike Insurance: " + insurance);
    }
}
