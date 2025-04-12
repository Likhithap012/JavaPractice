package com.gevernova.oops.eCommerceapalatform;

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Mobile", 10000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Wheat", 800);

        p1.displayFinalPrice();
        p2.displayFinalPrice();
        p3.displayFinalPrice();
    }
}
