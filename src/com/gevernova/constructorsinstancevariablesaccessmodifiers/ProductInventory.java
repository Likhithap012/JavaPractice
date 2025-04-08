package com.gevernova.constructorsinstancevariablesaccessmodifiers;

// Class to represent a Product
class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared across all Product objects)
    static int totalProducts = 0;

    // Constructor to initialize product and increment count
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // increment whenever a new product is created
    }

    // Instance method to display details of a product
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total number of products created
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Creating product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 1500);
        Product p3 = new Product("Smartphone", 25000);

        // Displaying individual product details
        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Displaying total products created
        Product.displayTotalProducts();
    }
}
