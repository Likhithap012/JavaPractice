package com.gevernova.constructors.accessmodifiers.booklibrarysystem;

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create Book object
        Book book = new Book("123-ABC", "Java Basics", "John Doe");
        book.displayBook();
        System.out.println();

        // Update author using setter
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println();

        // Create EBook object
        EBook ebook = new EBook("456-DEF", "Advanced Java", "Emily Clark", "PDF");
        ebook.displayEBook();
    }
}

