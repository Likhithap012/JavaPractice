package com.gevernova.constructorsinstancevariablesaccessmodifiers;

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

// Subclass demonstrating access to public and protected fields
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + accountNumber);       // Accessing public field
        System.out.println("Account Holder: " + accountHolder);       // Accessing protected field
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

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

