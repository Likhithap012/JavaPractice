package com.gevernova.inheritance.hierarchialinheritance.banksaccounttypes;

// Subclass 3: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
