package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class ReadSpecificFieldsFromJson {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:/Users/Likit/IdeaProjects/JavaPractice/Json/src/main/user.json")) {
            // Parse JSON file into JsonObject
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            // Extract specific fields
            String name = jsonObject.get("name").getAsString();
            String email = jsonObject.get("email").getAsString();

            // Print results
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (Exception e) {
            System.out.println("Error reading JSON: " + e.getMessage());
        }
    }
}

