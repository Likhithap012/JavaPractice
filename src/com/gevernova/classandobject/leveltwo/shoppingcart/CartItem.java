package com.gevernova.classandobject.leveltwo.shoppingcart;

// Class to represent an item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getCost() {
        return price * quantity;
    }
}
