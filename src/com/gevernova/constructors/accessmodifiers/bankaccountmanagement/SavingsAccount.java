package com.gevernova.constructors.accessmodifiers.bankaccountmanagement;

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
