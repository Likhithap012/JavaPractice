package com.gevernova.constructors.instanceandclassvariables.productinventory;

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
