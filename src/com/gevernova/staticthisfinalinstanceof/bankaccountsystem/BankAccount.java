package com.gevernova.staticthisfinalinstanceof.bankaccountsystem;

class BankAccount {
    // Static variable shared among all objects
    static String bankName = "Green Bank";

    // Static counter to track total number of accounts
    private static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;
    final int accountNumber; // final: can't be changed once assigned
    double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;  // 'this' refers to the instance variable
        this.accountNumber = accountNumber;          // 'this' again resolves ambiguity
        this.balance = balance;
        totalAccounts++; // Increment total accounts on creation
    }

    // Static method to return total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayDetails() {
        if (this instanceof BankAccount) { // Using 'instanceof'
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        } else {
            System.out.println("Invalid account.");
        }
    }
}
