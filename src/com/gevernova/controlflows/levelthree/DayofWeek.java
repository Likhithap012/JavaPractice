package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int Y = year % 100;
        int C = year / 100;
        int h = (day + (13 * (month + 1)) / 5 + Y + (Y / 4) + (C / 4) - (2 * C)) % 7;
        int dayOfWeek = (h + 6) % 7;
        System.out.println("Day of the week (0=Sunday, 1=Monday, ..., 6=Saturday): " + dayOfWeek);
    }
}
