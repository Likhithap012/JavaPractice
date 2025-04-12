package com.gevernova.classandobject.levelone.mobilephonedetails;

class MobilePhone {
    // Attributes to store phone details
    String brand;
    String model;
    double price;

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}
