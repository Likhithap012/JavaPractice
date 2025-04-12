package com.gevernova.constructors.accessmodifiers.booklibrarysystem;

// Book class
class Book {
    public String ISBN;           // Public - accessible anywhere
    protected String title;       // Protected - accessible in subclass
    private String author;        // Private - accessible only within the class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book info
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
