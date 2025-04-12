package com.gevernova.classandobject.leveltwo.movieticketbookingsystem;

import java.util.Scanner;

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

