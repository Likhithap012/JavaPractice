package com.gevernova.objectrelationshipsandcommunication.libraryandbooks;

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book bookOne = new Book("Harry Potter", "J.K. Rowling");
        Book bookTwo = new Book("Wings of Fire", "A.P.J Abdul Kalam");

        // Create library
        Library myLibrary = new Library("Central Library");

        // Add books to library
        myLibrary.addBook(bookOne);
        myLibrary.addBook(bookTwo);

        // Show books
        myLibrary.showLibraryBooks();
    }
}
