package com.gevernova.objectrelationshipsandcommunication.ecommerce;

// Product class
class EcomProduct {
    String name;
    double price;

    EcomProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(name + " - ₹" + price);
    }
}

