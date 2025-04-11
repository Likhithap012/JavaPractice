package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;

class Library{
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibraryBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            b.showBook();
        }
    }
}
class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
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
