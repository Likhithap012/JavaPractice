package com.gevernova.oops.bankingsystem;

// Subclass 1
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    public void applyForLoan() {
        System.out.println("Savings account loan applied");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}
