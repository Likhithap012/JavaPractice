package com.gevernova.inheritance.singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Author("The Java Guide", 2021, "Likhitha", "An experienced Java developer and writer.");
        book.displayInfo(); // Polymorphism - Calls Author's displayInfo
    }
}
