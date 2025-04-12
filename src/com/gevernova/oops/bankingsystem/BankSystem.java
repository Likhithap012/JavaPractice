package com.gevernova.oops.bankingsystem;

// Main class
class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA123", "Alice", 6000);
        BankAccount acc2 = new CurrentAccount("CA456", "Bob", 12000);

        acc1.deposit(1000);
        acc1.withdraw(500);
        System.out.println("Interest for " + acc1.getHolderName() + ": " + acc1.calculateInterest());

        acc2.deposit(2000);
        acc2.withdraw(1500);
        System.out.println("Interest for " + acc2.getHolderName() + ": " + acc2.calculateInterest());

        // Polymorphism via interface
        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan();
        System.out.println("Is " + acc1.getHolderName() + " eligible? " + loan1.calculateLoanEligibility());

        Loanable loan2 = (Loanable) acc2;
        loan2.applyForLoan();
        System.out.println("Is " + acc2.getHolderName() + " eligible? " + loan2.calculateLoanEligibility());
    }
}
