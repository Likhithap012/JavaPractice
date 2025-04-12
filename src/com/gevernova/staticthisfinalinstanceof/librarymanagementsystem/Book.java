package com.gevernova.staticthisfinalinstanceof.librarymanagementsystem;

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
