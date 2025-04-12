package com.gevernova.designprinciples.grocerystore;

import java.util.Arrays;
import java.util.List;

/**
 * Main class to simulate a grocery billing system.
 */
public class Main {
    public static void main(String[] args) {
        // Creating sample products with name, price, and quantity
        Product p1 = new Product("Milk", 30.0, 2);
        Product p2 = new Product("Bread", 25.0, 1);
        Product p3 = new Product("Eggs", 6.0, 12);

        // Adding products to a list
        List<Product> productList = Arrays.asList(p1, p2, p3);

        // Creating a customer with purchased products
        Customer customer = new Customer("Anjali", 1001, productList);

        // Generating and printing the bill
        BillGenerator billGen = new BillGenerator();
        billGen.generateBill(customer);
    }
}
