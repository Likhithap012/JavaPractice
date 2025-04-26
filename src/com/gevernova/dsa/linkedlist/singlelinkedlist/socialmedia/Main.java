package com.gevernova.dsa.linkedlist.singlelinkedlist.socialmedia;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        // Sample users
        socialNetwork.addUser(1, "Alice", 22);
        socialNetwork.addUser(2, "Bob", 24);
        socialNetwork.addUser(3, "Charlie", 23);
        socialNetwork.addUser(4, "Daisy", 21);

        // Adding friends
        socialNetwork.addFriendConnection(1, 2);
        socialNetwork.addFriendConnection(1, 3);
        socialNetwork.addFriendConnection(2, 3);
        socialNetwork.addFriendConnection(2, 4);

        // Display all users
        System.out.println("\n--- All Users ---");
        socialNetwork.displayAllUsers();

        // Display friends of Bob
        System.out.println("\n--- Friends of Bob (ID 2) ---");
        socialNetwork.displayFriends(2);

        // Mutual friends between Alice and Bob
        System.out.println("\n--- Mutual Friends: Alice & Bob ---");
        socialNetwork.displayMutualFriends(1, 2);

        // Count friends for each user
        System.out.println("\n--- Friend Count ---");
        socialNetwork.countFriendsForAllUsers();

        // Remove friend connection
        System.out.println("\n--- Removing friendship between Bob and Daisy ---");
        socialNetwork.removeFriendConnection(2, 4);
        socialNetwork.displayFriends(2);

        // Search
        System.out.println("\n--- Search for 'Charlie' ---");
        socialNetwork.searchByName("Charlie");
    }
}

