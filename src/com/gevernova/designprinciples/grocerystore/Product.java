package com.gevernova.designprinciples.grocerystore;

/**
 * Represents a product in the grocery store.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter methods for product properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total cost for the product
    public double getTotalCost() {
        return price * quantity;
    }
}
