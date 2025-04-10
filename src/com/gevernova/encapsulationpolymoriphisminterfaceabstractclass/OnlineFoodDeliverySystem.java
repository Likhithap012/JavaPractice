package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Interface
interface Discountable {
    void applyDiscount(double percentage);
    void getDiscountDetails();
}

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

// Main Class
public class OnlineFoodDeliverySystem {
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

