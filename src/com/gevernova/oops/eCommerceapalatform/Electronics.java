package com.gevernova.oops.eCommerceapalatform;

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public double getTaxDetails() {
        return calculateTax();
    }
}
