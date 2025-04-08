package com.gevernova.classandobject.leveltwo;

import java.util.Scanner;

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

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        // Taking booking input
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter ticket price: ₹");
        double price = scanner.nextDouble();

        // Booking the ticket
        ticket.bookTicket(movieName, seatNumber, price);

        // Displaying ticket details
        ticket.displayTicketDetails();
    }
}

