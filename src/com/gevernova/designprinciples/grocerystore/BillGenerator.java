package com.gevernova.designprinciples.grocerystore;

/**
 * Generates a bill for the given customer based on the products purchased.
 */
public class BillGenerator {

    // Method to calculate and print the bill for a customer
    public double generateBill(Customer customer) {
        double total = 0.0;

        System.out.println("----- Bill for Customer: " + customer.getName() + " -----");

        // Loop through each product and calculate its total cost
        for (Product product : customer.getProducts()) {
            double cost = product.getTotalCost();
            total += cost;

            // Print individual product details
            System.out.println(product.getName() + " - " + product.getQuantity() +
                    " x ₹" + product.getPrice() + " = ₹" + cost);
        }

        // Print the final total
        System.out.println("Total Bill: ₹" + total);
        return total;
    }
}

