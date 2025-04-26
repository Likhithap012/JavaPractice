package com.gevernova.oops.librarysystem;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem itemOne = new Book(101, "The Alchemist", "Paulo Coelho");
        LibraryItem itemTwo = new Magazine(102, "National Geographic", "John Doe");
        LibraryItem itemThree = new DVD(103, "Inception", "Christopher Nolan");

        itemOne.getItemDetails();
        System.out.println("Loan Duration: " + itemOne.getLoanDuration() + " days");

        itemTwo.getItemDetails();
        System.out.println("Loan Duration: " + itemTwo.getLoanDuration() + " days");

        itemThree.getItemDetails();
        System.out.println("Loan Duration: " + itemThree.getLoanDuration() + " days");

        // Polymorphism through interface
        Reservable res1 = (Reservable) itemOne;
        res1.reserveItem("Alice");
        System.out.println("Availability: " + res1.checkAvailability());

        Reservable res2 = (Reservable) itemTwo;
        res2.reserveItem("Bob");
        System.out.println("Availability: " + res2.checkAvailability());
    }
}

