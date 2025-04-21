package com.gevernova.dsa.linkedlist.singlelinkedlist.socialmedia;

public class Main {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        // Sample users
        sn.addUser(1, "Alice", 22);
        sn.addUser(2, "Bob", 24);
        sn.addUser(3, "Charlie", 23);
        sn.addUser(4, "Daisy", 21);

        // Adding friends
        sn.addFriendConnection(1, 2);
        sn.addFriendConnection(1, 3);
        sn.addFriendConnection(2, 3);
        sn.addFriendConnection(2, 4);

        // Display all users
        System.out.println("\n--- All Users ---");
        sn.displayAllUsers();

        // Display friends of Bob
        System.out.println("\n--- Friends of Bob (ID 2) ---");
        sn.displayFriends(2);

        // Mutual friends between Alice and Bob
        System.out.println("\n--- Mutual Friends: Alice & Bob ---");
        sn.displayMutualFriends(1, 2);

        // Count friends for each user
        System.out.println("\n--- Friend Count ---");
        sn.countFriendsForAllUsers();

        // Remove friend connection
        System.out.println("\n--- Removing friendship between Bob and Daisy ---");
        sn.removeFriendConnection(2, 4);
        sn.displayFriends(2);

        // Search
        System.out.println("\n--- Search for 'Charlie' ---");
        sn.searchByName("Charlie");
    }
}

