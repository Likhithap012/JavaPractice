package com.gevernova.constructors.accessmodifiers.bankaccountmanagement;

// BankAccount class
class BankAccount {
    public int accountNumber;          // Public - accessible anywhere
    protected String accountHolder;    // Protected - accessible in subclass
    private double balance;            // Private - only accessible within this class

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
