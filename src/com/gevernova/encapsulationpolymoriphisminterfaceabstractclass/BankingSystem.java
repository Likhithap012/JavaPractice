package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

//import com.gevernova.encapsulationpolymoriphisminterfaceabstractclass.BankingSystem;
// Abstract class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance (optional and protected)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Interface
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

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
