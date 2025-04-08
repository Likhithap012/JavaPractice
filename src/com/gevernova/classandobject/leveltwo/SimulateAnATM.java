package com.gevernova.classandobject.leveltwo;

import java.util.Scanner;

// Class representing a bank account
class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;

    // Method to deposit money
    void deposit(int amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Method to withdraw money (only if sufficient balance exists)
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to display current balance
    void currentBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class SimulateAnATM {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);

        // Take account details as input
        System.out.print("Enter Account Holder Name: ");
        bankAccount.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        bankAccount.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ₹");
        bankAccount.balance = sc.nextInt();

        int choice;
        do {
            // ATM menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    int depositAmount = sc.nextInt();
                    bankAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdrawAmount = sc.nextInt();
                    bankAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    bankAccount.currentBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
