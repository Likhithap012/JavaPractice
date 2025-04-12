package com.gevernova.inheritance.singleinheritance.librarymanagement;

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
