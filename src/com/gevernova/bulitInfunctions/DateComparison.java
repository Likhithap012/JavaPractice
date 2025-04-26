package com.gevernova.bulitInfunctions;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        String inputOne = scanner.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String inputTwo = scanner.nextLine();

        LocalDate dateOne = LocalDate.parse(inputOne);
        LocalDate dateTwo = LocalDate.parse(inputTwo);

        if (dateOne.isBefore(dateTwo)) {
            System.out.println("The first date is before the second date.");
        } else if (dateOne.isAfter(dateTwo)) {
            System.out.println("The first date is after the second date.");
        } else if (dateOne.isEqual(dateTwo)) {
            System.out.println("Both dates are the same.");
        }
    }
}

