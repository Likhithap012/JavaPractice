package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;

// Customer class
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

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

// Main class
class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("SBI");

        // Create customers
        Customer c1 = new Customer("Likhitha", 5000);
        Customer c2 = new Customer("Ananya", 10000);

        // Open accounts
        bank.openAccount(c1);
        bank.openAccount(c2);

        // Customers view their balance
        c1.viewBalance();
        c2.viewBalance();

        // Bank displays all customers
        bank.showAllCustomers();
    }
}

