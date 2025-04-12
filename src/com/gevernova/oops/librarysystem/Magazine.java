package com.gevernova.oops.librarysystem;

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

