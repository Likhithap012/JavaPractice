package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

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

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; // 7 days
    }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5; // 5 days
    }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(101, "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine(102, "National Geographic", "John Doe");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");

        // Polymorphism through interface
        Reservable res1 = (Reservable) item1;
        res1.reserveItem("Alice");
        System.out.println("Availability: " + res1.checkAvailability());

        Reservable res2 = (Reservable) item2;
        res2.reserveItem("Bob");
        System.out.println("Availability: " + res2.checkAvailability());
    }
}

