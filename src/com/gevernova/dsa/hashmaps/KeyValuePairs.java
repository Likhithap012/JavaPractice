package com.gevernova.dsa.hashmaps;

import java.util.LinkedList;

// Define the structure for a key-value pair
class KeyValuePairs {
    String key;
    String value;

    KeyValuePairs(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

// Define the custom HashMap class
class CustomHashMap {
    private LinkedList<KeyValuePairs>[] table;
    private int size;

    // Constructor to initialize the hash map with a given capacity
    public CustomHashMap(int capacity) {
        table = new LinkedList[capacity];
        size = 0;

        // Initialize each bucket (linked list) to avoid null pointers
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to get the index for the given key
    private int hash(String key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Insert or update a key-value pair
    public void put(String key, String value) {
        int index = hash(key);
        LinkedList<KeyValuePairs> bucket = table[index];

        // Check if the key already exists, update if found
        for (KeyValuePairs pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;  // Update the value
                return;
            }
        }

        // If the key does not exist, insert a new key-value pair
        bucket.add(new KeyValuePairs(key, value));
        size++;
    }

    // Retrieve the value associated with the given key
    public String get(String key) {
        int index = hash(key);
        LinkedList<KeyValuePairs> bucket = table[index];

        // Search for the key in the corresponding bucket
        for (KeyValuePairs pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        // Return null if the key is not found
        return null;
    }

    // Remove the key-value pair for the given key
    public void remove(String key) {
        int index = hash(key);
        LinkedList<KeyValuePairs> bucket = table[index];

        // Iterate through the bucket and find the key
        for (KeyValuePairs pair : bucket) {
            if (pair.key.equals(key)) {
                bucket.remove(pair);  // Remove the key-value pair
                size--;
                return;
            }
        }
    }

    // Get the size of the hash map (number of key-value pairs)
    public int size() {
        return size;
    }

    // Check if the hash map contains the given key
    public boolean containsKey(String key) {
        return get(key) != null;
    }
}

// Driver code to test the custom HashMap implementation
class KeyValue {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);

        // Inserting key-value pairs
        map.put("name", "Alice");
        map.put("age", "25");
        map.put("city", "New York");

        // Retrieving values
        System.out.println("Name: " + map.get("name"));  // Output: Alice
        System.out.println("Age: " + map.get("age"));    // Output: 25
        System.out.println("City: " + map.get("city"));  // Output: New York

        // Checking size
        System.out.println("Size: " + map.size());  // Output: 3

        // Removing a key-value pair
        map.remove("age");
        System.out.println("Size after removal: " + map.size());  // Output: 2

        // Checking if a key exists
        System.out.println("Contains 'age'? " + map.containsKey("age"));  // Output: false
        System.out.println("Contains 'city'? " + map.containsKey("city"));  // Output: true
    }
}

