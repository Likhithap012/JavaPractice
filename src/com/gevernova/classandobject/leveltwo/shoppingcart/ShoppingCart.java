package com.gevernova.classandobject.leveltwo.shoppingcart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding first item
        System.out.print("Enter item name: ");
        String nameOne = scanner.nextLine();
        System.out.print("Enter price: ");
        double priceOne = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantityOne = scanner.nextInt();
        cart.add(new CartItem(nameOne, priceOne, quantityOne));
        scanner.nextLine(); // consume newline

        // Adding second item
        System.out.print("Enter another item name: ");
        String nameTwo = scanner.nextLine();
        System.out.print("Enter price: ");
        double priceTwo = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantityTwo = scanner.nextInt();
        cart.add(new CartItem(nameTwo, priceTwo, quantityTwo));

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

