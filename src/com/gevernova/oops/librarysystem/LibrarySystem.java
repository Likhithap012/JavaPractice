package com.gevernova.oops.librarysystem;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(101, "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine(102, "National Geographic", "John Doe");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");

        // Polymorphism through interface
        Reservable res1 = (Reservable) item1;
        res1.reserveItem("Alice");
        System.out.println("Availability: " + res1.checkAvailability());

        Reservable res2 = (Reservable) item2;
        res2.reserveItem("Bob");
        System.out.println("Availability: " + res2.checkAvailability());
    }
}

