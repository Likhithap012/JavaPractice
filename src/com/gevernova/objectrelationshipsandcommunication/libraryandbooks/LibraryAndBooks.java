package com.gevernova.objectrelationshipsandcommunication.libraryandbooks;

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("Wings of Fire", "A.P.J Abdul Kalam");

        // Create library
        Library myLibrary = new Library("Central Library");

        // Add books to library
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);

        // Show books
        myLibrary.showLibraryBooks();
    }
}
