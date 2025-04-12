package com.gevernova.classandobject.levelone.trackinventory;

class Item {
    int itemCode;
    String itemName;
    Double price;

    void display() {//Display details
        System.out.println(this.itemCode);
        System.out.println(this.itemName);
        System.out.println(this.price);
    }

    //calculate the total cost for a given quantity
    double calculate(int quantity) {
        System.out.println(price * quantity);
        return 0;
    }
}
