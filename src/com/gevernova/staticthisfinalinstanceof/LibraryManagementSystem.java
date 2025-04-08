package com.gevernova.staticthisfinalinstanceof;

class Book {
    // Static variable shared among all Book objects
    static String libraryName = "Central City Library";

    // Instance variables
    String title;
    String author;
    final String isbn; // final: can't be changed once assigned

    // Constructor using 'this' keyword to resolve variable shadowing
    public Book(String title, String author, String isbn) {
        this.title = title;     // 'this' refers to instance variable
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + isbn);
        } else {
            System.out.println("Invalid Book");
        }
    }
}

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

