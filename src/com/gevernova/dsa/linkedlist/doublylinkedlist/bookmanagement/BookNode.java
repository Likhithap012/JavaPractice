package com.gevernova.dsa.linkedlist.doublylinkedlist.bookmanagement;

public class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    BookNode prev, next;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
