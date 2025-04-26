package com.gevernova.generics.dynamiconlinemarketplace;

public class MarketplaceDemo {
    public static void main(String[] args) {
        // Categories as Strings
        Product<String> book = new Product<>("Java in Depth", "Educational", 60.0);
        Product<String> jeans = new Product<>("Blue Jeans", "Clothing", 45.0);
        Product<String> laptop = new Product<>("Gaming Laptop", "Gadget", 1200.0);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(jeans);
        catalog.addProduct(laptop);

        System.out.println("Catalog before discount:");
        catalog.displayCatalog();

        // Apply discounts
        DiscountUtility.applyDiscount(book, 15);
        DiscountUtility.applyDiscount(laptop, 10);

        System.out.println("\nCatalog after discount:");
        catalog.displayCatalog();
    }
}

