package com.gevernova.oops.bankingsystem;

// Subclass 2
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    public void applyForLoan() {
        System.out.println("Current account loan applied");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}
