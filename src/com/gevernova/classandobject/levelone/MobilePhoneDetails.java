package com.gevernova.classandobject.levelone;

import java.util.Scanner;

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
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of MobilePhone
        MobilePhone phone = new MobilePhone();

        // Taking input from user
        System.out.print("Enter Brand: ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Model: ");
        phone.model = sc.nextLine();

        System.out.print("Enter Price: ");
        phone.price = sc.nextDouble();

        // Displaying the phone details
        System.out.println("\n--- Mobile Phone Details ---");
        phone.displayDetails();
    }
}
