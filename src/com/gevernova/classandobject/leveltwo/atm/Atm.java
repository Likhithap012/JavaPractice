package com.gevernova.classandobject.leveltwo.atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        // Take account details as input
        System.out.print("Enter Account Holder Name: ");
        bankAccount.accountHolder = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        bankAccount.accountNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: ₹");
        bankAccount.balance = scanner.nextInt();

        int choice;
        do {
            // ATM menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    int depositAmount = scanner.nextInt();
                    bankAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdrawAmount = scanner.nextInt();
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
