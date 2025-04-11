package com.gevernova.inheritance.hierarchialinheritance;

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

// Subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

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

