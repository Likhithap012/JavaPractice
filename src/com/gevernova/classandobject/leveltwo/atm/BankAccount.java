package com.gevernova.classandobject.leveltwo.atm;

// Class representing a bank account
class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;

    // Method to deposit money
    void deposit(int amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Method to withdraw money (only if sufficient balance exists)
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to display current balance
    void currentBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
