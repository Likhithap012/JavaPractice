package com.gevernova.classandobject.levelone.trackinventory;

import java.util.Scanner;

public class TrackInventoryOfItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of Item
        Item item = new Item();

        // Take input from user for item details
        System.out.print("Enter Item Code: ");
        item.itemCode = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        item.itemName = scanner.nextLine();

        System.out.print("Enter Price per Unit: ");
        item.price = scanner.nextDouble();

        // Display item details
        System.out.println("\n--- Item Details ---");
        item.display();

        // Ask for quantity and calculate total cost
        System.out.print("\nEnter Quantity to Purchase: ");
        int quantity = scanner.nextInt();

        double total = item.calculate(quantity);
        System.out.println("Total Cost for " + quantity + " units: ₹" + total);
    }
}
