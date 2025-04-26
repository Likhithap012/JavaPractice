package com.gevernova.objectrelationshipsandcommunication.bankandaccountholders;

class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("SBI");

        // Create customers
        Customer customerOne = new Customer("Likhitha", 5000);
        Customer customerTwo = new Customer("Ananya", 10000);

        // Open accounts
        bank.openAccount(customerOne);
        bank.openAccount(customerTwo);

        // Customers view their balance
        customerOne.viewBalance();
        customerTwo.viewBalance();

        // Bank displays all customers
        bank.showAllCustomers();
    }
}
