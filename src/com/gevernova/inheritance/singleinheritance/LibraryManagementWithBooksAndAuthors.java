package com.gevernova.inheritance.singleinheritance;

class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Publication Year: " + this.publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio; // ✅ Add this line to set the bio
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Optional: Reuse the base display
        System.out.println("Author Name: " + this.name);
        System.out.println("Bio: " + this.bio);
    }
}

public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] args) {
        Book book = new Author("The Java Guide", 2021, "Likhitha", "An experienced Java developer and writer.");
        book.displayInfo(); // Polymorphism - Calls Author's displayInfo
    }
}
