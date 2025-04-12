package com.gevernova.oops.eCommerceapalatform;

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    // Encapsulation: Getters and Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayFinalPrice() {
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).getTaxDetails(); // now using getTaxDetails
        }
        double discount = calculateDiscount();
        double finalPrice = price + tax - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----------------------");
    }
}
