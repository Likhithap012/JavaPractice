package com.gevernova.classandobject.levelone.mobilephonedetails;

import java.util.Scanner;

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of MobilePhone
        MobilePhone phone = new MobilePhone();

        // Taking input from user
        System.out.print("Enter Brand: ");
        phone.brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        phone.model = scanner.nextLine();

        System.out.print("Enter Price: ");
        phone.price = scanner.nextDouble();

        // Displaying the phone details
        System.out.println("\n--- Mobile Phone Details ---");
        phone.displayDetails();
    }
}
