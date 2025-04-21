package com.gevernova.dsa.linkedlist.doublylinkedlist.moviemanagement;

public class Main {
    public static void main(String[] args) {
        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        // Add movies
        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtPosition(2, "The Matrix", "Wachowski", 1999, 8.7);

        // Display
        movies.displayForward();
        movies.displayReverse();

        // Search
        movies.searchByDirector("Christopher Nolan");
        movies.searchByRating(8.7);

        // Update
        movies.updateRating("Inception", 9.0);

        // Remove
        movies.removeByTitle("The Matrix");

        // Final display
        movies.displayForward();
    }
}

