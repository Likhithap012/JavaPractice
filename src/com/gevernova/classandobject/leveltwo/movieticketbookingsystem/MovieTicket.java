package com.gevernova.classandobject.leveltwo.movieticketbookingsystem;

// MovieTicket class
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String movie, int seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}
