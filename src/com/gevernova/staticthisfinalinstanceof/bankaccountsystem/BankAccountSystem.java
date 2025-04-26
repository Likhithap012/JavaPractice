package com.gevernova.staticthisfinalinstanceof.bankaccountsystem;


// Main class to test
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Likhitha", 101, 50000);
        BankAccount accountTwo = new BankAccount("Ravi", 102, 75000);

        if (accountOne instanceof BankAccount) {
            ((BankAccount) accountOne).displayDetails();
        }

        if (accountTwo instanceof BankAccount) {
            ((BankAccount) accountTwo).displayDetails();
        }

        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
}

