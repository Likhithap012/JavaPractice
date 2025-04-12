package com.gevernova.inheritance.hierarchialinheritance.banksaccounttypes;

class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 20000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 15000.0, 10000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 50000.0, 12);

        System.out.println("--- Savings Account ---");
        sa.displayBasicInfo();
        sa.displayAccountType();

        System.out.println("\n--- Checking Account ---");
        ca.displayBasicInfo();
        ca.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account ---");
        fda.displayBasicInfo();
        fda.displayAccountType();
    }
}
