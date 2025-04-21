package com.gevernova.dsa.linkedlist.circularlinkedlist.onlineticketmanagement;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add some tickets
        system.addTicket(1, "Alice", "Avengers: Endgame", "A1", "2025-04-21 10:00 AM");
        system.addTicket(2, "Bob", "Spider-Man: No Way Home", "B1", "2025-04-21 02:00 PM");
        system.addTicket(3, "Charlie", "Avengers: Endgame", "A2", "2025-04-21 06:00 PM");

        // Display all booked tickets
        system.displayTickets();

        // Search tickets by Customer Name
        system.searchTicket("Alice");

        // Remove a ticket by Ticket ID
        system.removeTicket(2);

        // Display all booked tickets again
        system.displayTickets();

        // Calculate total booked tickets
        system.totalBookedTickets();
    }
}

