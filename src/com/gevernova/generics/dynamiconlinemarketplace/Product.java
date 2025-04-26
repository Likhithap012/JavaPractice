package com.gevernova.generics.dynamiconlinemarketplace;

class Product<T> {
    private String name;
    private T category;
    private double price;

    public Product(String name, T category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    @Override
    public String toString() {
        return name + " (" + category.toString() + "): $" + String.format("%.2f", price);
    }
}

