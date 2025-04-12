package com.gevernova.staticthisfinalinstanceof.librarymanagementsystem;

// Main class to test the program
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display static library name
        Book.displayLibraryName();

        System.out.println();

        // Create Book objects
        Book book1 = new Book("Wings of Fire", "A.P.J Abdul Kalam", "978-81-7371-146-6");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "978-06-0452-272-1");

        // Display details
        if (book1 instanceof Book) {
            ((Book) book1).displayBookDetails();
            System.out.println();
        }

        if (book2 instanceof Book) {
            ((Book) book2).displayBookDetails();
        }
    }
}

