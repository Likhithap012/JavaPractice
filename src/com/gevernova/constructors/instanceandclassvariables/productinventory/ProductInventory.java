package com.gevernova.constructors.instanceandclassvariables.productinventory;

public class ProductInventory {
    public static void main(String[] args) {
        // Creating product objects
        Product productOne = new Product("Laptop", 55000);
        Product productTwo = new Product("Headphones", 1500);
        Product productThree = new Product("Smartphone", 25000);

        // Displaying individual product details
        productOne.displayProductDetails();
        System.out.println();

        productTwo.displayProductDetails();
        System.out.println();

        productThree.displayProductDetails();
        System.out.println();

        // Displaying total products created
        Product.displayTotalProducts();
    }
}
