package com.gevernova.oops.bankingsystem;

// Abstract class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance (optional and protected)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
