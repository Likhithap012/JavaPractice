package com.gevernova.constructorsinstancevariablesaccessmodifiers;

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

