package com.gevernova.oops.eCommerceapalatform;

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public double getTaxDetails() {
        return calculateTax();
    }
}
