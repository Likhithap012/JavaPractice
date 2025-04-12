package com.gevernova.objectrelationshipsandcommunication.bankandaccountholders;

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
