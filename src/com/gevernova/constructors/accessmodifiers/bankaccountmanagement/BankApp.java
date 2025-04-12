package com.gevernova.constructors.accessmodifiers.bankaccountmanagement;

// Main class
public class BankApp {
    public static void main(String[] args) {
        // Creating BankAccount object
        BankAccount account = new BankAccount(101, "Likhitha", 5000.0);
        account.displayAccountInfo();
        System.out.println();

        // Deposit and Withdraw
        account.deposit(2000);
        account.withdraw(1000);
        System.out.println("Updated Balance: $" + account.getBalance());
        System.out.println();

        // Creating SavingsAccount object
        SavingsAccount savings = new SavingsAccount(202, "Sai", 8000.0, 4.5);
        savings.displaySavingsInfo();
    }
}

