package com.gevernova.objectrelationshipsandcommunication.ecommerce;

// Main class
class EcomPlatform {
    public static void main(String[] args) {
        // Create products
        EcomProduct productOne = new EcomProduct("Laptop", 60000);
        EcomProduct productTwo = new EcomProduct("Smartphone", 25000);
        EcomProduct productThree = new EcomProduct("Headphones", 2000);

        // Create customer
        EcomCustomer customer = new EcomCustomer("Likhitha");

        // Create order 1 and add products
        EcomOrder order1 = new EcomOrder(101);
        order1.addProduct(productOne);
        order1.addProduct(productThree);

        // Create order 2 and add products
        EcomOrder order2 = new EcomOrder(102);
        order2.addProduct(productTwo);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show all orders placed by customer
        customer.showAllOrders();
    }
}
