package com.gevernova.dsa.linkedlist.singlelinkedlist.socialmedia;
import java.util.*;

public class SocialNetwork {
    private UserNode head;

    // Add new user
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        UserNode current = head;
        while (current.next != null) current = current.next;
        current.next = newUser;
    }

    // Search user by ID
    public UserNode getUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) return current;
            current = current.next;
        }
        return null;
    }

    // Search user by Name
    public void searchByName(String name) {
        UserNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                printUser(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No user with name: " + name);
    }

    // Add friend connection (bidirectional)
    public void addFriendConnection(int userId1, int userId2) {
        UserNode u1 = getUserById(userId1);
        UserNode u2 = getUserById(userId2);
        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!u1.friendIds.contains(userId2)) u1.friendIds.add(userId2);
        if (!u2.friendIds.contains(userId1)) u2.friendIds.add(userId1);
    }

    // Remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode u1 = getUserById(userId1);
        UserNode u2 = getUserById(userId2);
        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        u1.friendIds.remove(Integer.valueOf(userId2));
        u2.friendIds.remove(Integer.valueOf(userId1));
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Friends of " + user.name + ":");
        for (int id : user.friendIds) {
            UserNode friend = getUserById(id);
            if (friend != null)
                System.out.println("- " + friend.name + " (ID: " + id + ")");
        }
    }

    // Mutual friends between two users
    public void displayMutualFriends(int userId1, int userId2) {
        UserNode u1 = getUserById(userId1);
        UserNode u2 = getUserById(userId2);
        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> mutuals = new HashSet<>(u1.friendIds);
        mutuals.retainAll(u2.friendIds);

        System.out.println("Mutual Friends between " + u1.name + " and " + u2.name + ":");
        if (mutuals.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int id : mutuals) {
                UserNode mf = getUserById(id);
                if (mf != null)
                    System.out.println("- " + mf.name + " (ID: " + id + ")");
            }
        }
    }

    // Count friends for each user
    public void countFriendsForAllUsers() {
        UserNode current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friend(s).");
            current = current.next;
        }
    }

    // Print user info
    public void printUser(UserNode user) {
        System.out.println("User ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
    }

    // Display all users
    public void displayAllUsers() {
        UserNode current = head;
        while (current != null) {
            printUser(current);
            current = current.next;
        }
    }
}

