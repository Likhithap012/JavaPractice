package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;
import java.util.List;

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

// Order class
class EcomOrder {
    int orderId;
    List<EcomProduct> productList = new ArrayList<>();

    EcomOrder(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(EcomProduct product) {
        productList.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (EcomProduct p : productList) {
            p.displayProduct();
        }
    }
}

// Customer class
class EcomCustomer {
    String name;
    List<EcomOrder> orders = new ArrayList<>();

    EcomCustomer(String name) {
        this.name = name;
    }

    void placeOrder(EcomOrder order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.orderId);
    }

    void showAllOrders() {
        System.out.println("\n" + name + "'s Orders:");
        for (EcomOrder o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

// Main class
class EcomPlatform {
    public static void main(String[] args) {
        // Create products
        EcomProduct p1 = new EcomProduct("Laptop", 60000);
        EcomProduct p2 = new EcomProduct("Smartphone", 25000);
        EcomProduct p3 = new EcomProduct("Headphones", 2000);

        // Create customer
        EcomCustomer customer = new EcomCustomer("Likhitha");

        // Create order 1 and add products
        EcomOrder order1 = new EcomOrder(101);
        order1.addProduct(p1);
        order1.addProduct(p3);

        // Create order 2 and add products
        EcomOrder order2 = new EcomOrder(102);
        order2.addProduct(p2);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show all orders placed by customer
        customer.showAllOrders();
    }
}
