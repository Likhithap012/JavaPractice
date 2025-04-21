package com.gevernova.dsa.linkedlist.circularlinkedlist.onlineticketmanagement;

public class TicketReservationSystem {
    private TicketNode head;  // Points to the first ticket
    private TicketNode tail;  // Points to the last ticket
    private int ticketCount;  // Tracks the number of booked tickets

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.ticketCount = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = tail = newTicket;
            newTicket.next = head; // Circular reference
        } else {
            // Add the new ticket at the end of the circular list
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Maintain the circular link
        }

        ticketCount++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets available to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        // Loop through the list to find the ticket with the given Ticket ID
        do {
            if (current.ticketID == ticketID) {
                if (previous == null) {
                    // If the node to be deleted is the head
                    head = current.next;
                    tail.next = head; // Maintain circular link
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous; // Update tail if the last node is removed
                    }
                }

                ticketCount--;
                System.out.println("Ticket with ID " + ticketID + " has been removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all the tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        System.out.println("Displaying all booked tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName
                    + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets available to search.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        do {
            if (current.customerName.contains(searchTerm) || current.movieName.contains(searchTerm)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName
                        + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found matching the search term.");
        }
    }

    // Calculate the total number of booked tickets
    public void totalBookedTickets() {
        System.out.println("Total number of booked tickets: " + ticketCount);
    }
}

