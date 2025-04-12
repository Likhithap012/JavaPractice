package com.gevernova.oops.librarysystem;

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

