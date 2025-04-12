package com.gevernova.oops.onlinefooddeliverysystem;

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double nonVegCharge = base * 0.10; // 10% extra charge
        totalPrice = base + nonVegCharge;
        return totalPrice;
    }

    public void applyDiscount(double percentage) {
        discount = (totalPrice * percentage) / 100;
        totalPrice -= discount;
    }

    public void getDiscountDetails() {
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Price After Discount: ₹" + totalPrice);
    }
}
