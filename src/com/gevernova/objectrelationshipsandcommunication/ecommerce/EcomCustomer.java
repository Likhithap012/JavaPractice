package com.gevernova.objectrelationshipsandcommunication.ecommerce;

import java.util.ArrayList;
import java.util.List;

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
