package com.gevernova.bulitInfunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatThree = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + today.format(formatOne));
        System.out.println("Format 2: " + today.format(formatTwo));
        System.out.println("Format 3: " + today.format(formatThree));
    }
}
