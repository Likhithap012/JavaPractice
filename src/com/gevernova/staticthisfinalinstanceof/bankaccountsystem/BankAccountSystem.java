package com.gevernova.staticthisfinalinstanceof.bankaccountsystem;


// Main class to test
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Likhitha", 101, 50000);
        BankAccount acc2 = new BankAccount("Ravi", 102, 75000);

        if (acc1 instanceof BankAccount) {
            ((BankAccount) acc1).displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            ((BankAccount) acc2).displayDetails();
        }

        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
}

