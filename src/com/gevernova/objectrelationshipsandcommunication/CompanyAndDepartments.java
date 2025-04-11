package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;

// Customer class
class Customers {
    String name;
    double balance;

    Customers(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

// Bank class
class Banks {
    String bankName;
    ArrayList<Customers> customers = new ArrayList<>();  // Fixed to match class name

    Banks(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customers customer) {  // Fixed to match class name
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    void showAllCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customers c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

// Main class
public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a bank
        Banks banka = new Banks("SBI");

        // Create customers
        Customers c1 = new Customers("Likhitha", 5000);
        Customers c2 = new Customers("Ananya", 10000);

        // Open accounts
        banka.openAccount(c1);  // fixed variable name
        banka.openAccount(c2);  // fixed variable name

        // Customers view their balance
        c1.viewBalance();
        c2.viewBalance();

        // Bank displays all customers
        banka.showAllCustomers();  // fixed variable name
    }
}
