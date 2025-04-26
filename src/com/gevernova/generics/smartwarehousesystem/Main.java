package com.gevernova.generics.smartwarehousesystem;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Displaying Electronics:");
        DisplayUtils.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nDisplaying Groceries:");
        DisplayUtils.displayAllItems(groceriesStorage.getItems());

        System.out.println("\nDisplaying Furniture:");
        DisplayUtils.displayAllItems(furnitureStorage.getItems());
    }
}

