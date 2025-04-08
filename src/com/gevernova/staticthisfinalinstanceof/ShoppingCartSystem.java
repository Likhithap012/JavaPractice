package com.gevernova.staticthisfinalinstanceof;

public class ShoppingCartSystem {

    static class Product {
        // Static variable for discount shared by all products
        static double discount = 10.0; // in percentage

        // Instance variables
        final int productID; // final variable
        String productName;
        double price;
        int quantity;

        // Constructor using 'this' keyword
        public Product(int productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        // Static method to update discount
        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
        }

        // Method to display product details using instanceof
        public void displayProductDetails() {
            if (this instanceof Product) {
                System.out.println("Product ID   : " + productID);
                System.out.println("Name         : " + productName);
                System.out.println("Price        : ₹" + price);
                System.out.println("Quantity     : " + quantity);
                System.out.println("Discount     : " + discount + "%");
                double total = price * quantity;
                double discountedTotal = total - (total * discount / 100);
                System.out.println("Total after discount: ₹" + discountedTotal);
            } else {
                System.out.println("Invalid Product");
            }
        }
    }

    public static void main(String[] args) {
        // Update shared discount
        Product.updateDiscount(15.0);

        // Object as a generic type (Object class)
        Object obj1 = new Product(1001, "Bluetooth Speaker", 2000.0, 2);
        Object obj2 = "Not a product";

        // Check and cast using instanceof
        if (obj1 instanceof Product) {
            ((Product) obj1).displayProductDetails();
        } else {
            System.out.println("Invalid product: obj1");
        }

        System.out.println();

        if (obj2 instanceof Product) {
            ((Product) obj2).displayProductDetails();
        } else {
            System.out.println("Invalid product: obj2");
        }
    }
}

