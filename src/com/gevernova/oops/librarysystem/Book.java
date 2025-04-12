package com.gevernova.oops.librarysystem;

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
