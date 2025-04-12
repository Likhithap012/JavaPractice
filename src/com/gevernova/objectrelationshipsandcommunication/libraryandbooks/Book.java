package com.gevernova.objectrelationshipsandcommunication.libraryandbooks;

class Book {
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
