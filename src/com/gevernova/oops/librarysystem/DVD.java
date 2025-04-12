package com.gevernova.oops.librarysystem;

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
