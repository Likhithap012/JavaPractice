package com.gevernova.classandobject.leveltwo;

import java.util.ArrayList;
import java.util.Scanner;

// Class to represent an item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding first item
        System.out.print("Enter item name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity1 = sc.nextInt();
        cart.add(new CartItem(name1, price1, quantity1));
        sc.nextLine(); // consume newline

        // Adding second item
        System.out.print("Enter another item name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity2 = sc.nextInt();
        cart.add(new CartItem(name2, price2, quantity2));

        // Display cart details
        double total = 0;
        System.out.println("\nItems in your cart:");
        for (CartItem item : cart) {
            double itemCost = item.getCost();
            System.out.println(item.quantity + " x " + item.itemName + " @ ₹" + item.price + " = ₹" + itemCost);
            total += itemCost;
        }

        System.out.println("Total cost: ₹" + total);
    }
}

