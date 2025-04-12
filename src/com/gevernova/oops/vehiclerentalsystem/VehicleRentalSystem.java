package com.gevernova.oops.vehiclerentalsystem;

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
