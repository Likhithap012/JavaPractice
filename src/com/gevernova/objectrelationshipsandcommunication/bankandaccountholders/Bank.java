package com.gevernova.objectrelationshipsandcommunication.bankandaccountholders;

import java.util.ArrayList;

// Bank class
class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    void showAllCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}
