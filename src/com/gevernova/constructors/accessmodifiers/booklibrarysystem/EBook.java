package com.gevernova.constructors.accessmodifiers.booklibrarysystem;

// Subclass EBook
class EBook extends Book {
    private String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Display EBook info
    public void displayEBook() {
        System.out.println("EBook ISBN: " + ISBN);        // Accessing public member
        System.out.println("EBook Title: " + title);      // Accessing protected member
        System.out.println("EBook Format: " + fileFormat);
    }
}
