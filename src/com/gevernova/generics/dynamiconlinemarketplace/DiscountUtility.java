package com.gevernova.generics.dynamiconlinemarketplace;

public class DiscountUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}

