package com.gevernova.inheritance.hierarchialinheritance.banksaccounttypes;

// Base class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBasicInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
