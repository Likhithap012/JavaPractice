package com.gevernova.oops.eCommerceapalatform;

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product productOne = new Electronics(1, "Mobile", 10000);
        Product productTwo = new Clothing(2, "Shirt", 2000);
        Product productThree = new Groceries(3, "Wheat", 800);

        productOne.displayFinalPrice();
        productTwo.displayFinalPrice();
        productThree.displayFinalPrice();
    }
}
