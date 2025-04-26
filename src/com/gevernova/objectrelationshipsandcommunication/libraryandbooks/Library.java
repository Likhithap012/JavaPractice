package com.gevernova.objectrelationshipsandcommunication.libraryandbooks;

import java.util.ArrayList;

class Library {
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
        for (Book book : books) {
            book.showBook();
        }
    }
}
