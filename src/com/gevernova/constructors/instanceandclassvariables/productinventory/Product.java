package com.gevernova.constructors.instanceandclassvariables.productinventory;

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
