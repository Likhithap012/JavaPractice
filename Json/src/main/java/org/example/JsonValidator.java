package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {
    public static boolean isValidJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(json);
            return true; // JSON is valid
        } catch (Exception e) {
            return false; // JSON is invalid
        }
    }

    public static void main(String[] args) {
        String validJson = "{\"name\":\"Likhitha\", \"age\":21}";
        String invalidJson = "{name: Likhitha, age: 21}";

        System.out.println("Valid JSON? " + isValidJson(validJson));   // true
        System.out.println("Valid JSON? " + isValidJson(invalidJson)); // false
    }
}
