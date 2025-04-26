package com.gevernova.dsa.hashmaps.keyvaluepairs;

import java.util.LinkedList;

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
