package com.gevernova.oops.onlinefooddeliverysystem;

// Main Class
class OnlineFoodDeliverySystem {
    // Polymorphic Order Processor
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        System.out.println("Total Price (Before Discount): ₹" + total);

        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            discountable.applyDiscount(10); // Apply 10% discount
            discountable.getDiscountDetails();
        }

        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 180, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 3);

        // Polymorphic handling of food items
        processOrder(veg);
        processOrder(nonVeg);
    }
}
