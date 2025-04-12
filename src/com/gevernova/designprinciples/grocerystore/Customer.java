package com.gevernova.designprinciples.grocerystore;

import java.util.List;

/**
 * Represents a customer who buys products.
 */
public class Customer {
    private String name;
    private int customerId;
    private List<Product> products; // Composition: Customer "owns" the products

    // Constructor to initialize customer details and the list of purchased products
    public Customer(String name, int customerId, List<Product> products) {
        this.name = name;
        this.customerId = customerId;
        this.products = products;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
