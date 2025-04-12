package com.gevernova.oops.librarysystem;

// Abstract class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Encapsulation for borrower
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrower() {
        return borrower;
    }
}
