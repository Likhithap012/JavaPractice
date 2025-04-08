package com.gevernova.strings.levelthree;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i * ranks.length + j] = ranks[j] + " of " + suits[i];
            }
        }
        Random random = new Random();
        for (int i = 0; i < numOfCards; i++) {
            int randomCardNumber = i + random.nextInt(numOfCards - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        if (players * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards for distribution.");
            return;
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[i * cardsPerPlayer + j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}

