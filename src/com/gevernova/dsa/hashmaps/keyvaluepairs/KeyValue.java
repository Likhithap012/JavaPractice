package com.gevernova.dsa.hashmaps.keyvaluepairs;

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
