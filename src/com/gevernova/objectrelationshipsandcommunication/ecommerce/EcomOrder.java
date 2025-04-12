package com.gevernova.objectrelationshipsandcommunication.ecommerce;

import java.util.ArrayList;
import java.util.List;

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
