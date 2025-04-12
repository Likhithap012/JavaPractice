package com.gevernova.oops.onlinefooddeliverysystem;

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();  // no extra charge
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
