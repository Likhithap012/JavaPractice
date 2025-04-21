package com.gevernova.dsa.linkedlist.singlelinkedlist.inventorymanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListInventory inventory = new LinkedListInventory();
        Scanner sc = new Scanner(System.in);

        inventory.addAtEnd("Pen", 101, 20, 1.5);
        inventory.addAtEnd("Notebook", 102, 10, 5.0);
        inventory.addAtBeginning("Pencil", 103, 30, 0.5);
        inventory.addAtPosition("Marker", 104, 5, 2.0, 2);

        System.out.println("\n--- All Items ---");
        inventory.displayAllItems();

        System.out.println("\n--- Total Inventory Value ---");
        System.out.println("$" + inventory.calculateTotalValue());

        System.out.println("\n--- Sorting by Name Ascending ---");
        inventory.sortByName(true);
        inventory.displayAllItems();

        System.out.println("\n--- Search by ID 102 ---");
        inventory.searchById(102);

        System.out.println("\n--- Updating Quantity of ID 101 to 100 ---");
        inventory.updateQuantityById(101, 100);
        inventory.searchById(101);

        System.out.println("\n--- Remove Item with ID 104 ---");
        inventory.removeById(104);
        inventory.displayAllItems();
    }
}
