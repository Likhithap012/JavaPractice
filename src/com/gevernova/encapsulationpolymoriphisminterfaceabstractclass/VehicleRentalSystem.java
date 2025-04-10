package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Getters and Setters
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

// Interface
interface Insurable {
    int calculateInsurance();
    void getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    int insurance;

    public Car(int vehicleNumber, String type, Double rentalRate, int insurance) {
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
        System.out.println("Car Insurance: " + insurance);
    }
}

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

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(1, "Car", 2000.7, 200);
        Bike bike = new Bike(2, "Bike", 1000.5, 150);
        Truck truck = new Truck(3, "Truck", 5000.0, 300);

        // Car
        System.out.println("Car Rent for 3 days: " + car.calculateRentalCost(3));
        car.calculateInsurance();
        car.getInsuranceDetails();

        // Bike
        System.out.println("Bike Rent for 2 days: " + bike.calculateRentalCost(2));
        bike.calculateInsurance();
        bike.getInsuranceDetails();

        // Truck
        System.out.println("Truck Rent for 4 days: " + truck.calculateRentalCost(4));
        truck.calculateInsurance();
        truck.getInsuranceDetails();
    }
}
