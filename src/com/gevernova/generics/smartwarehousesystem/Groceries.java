package com.gevernova.generics.smartwarehousesystem;

public class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery Item: " + getName());
    }
}
