package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Bank account = new Bank(1000); // Initial balance

        try {
            account.withdraw(-100); // Negative amount
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(1500); // More than balance
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(500); // Valid withdrawal
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
