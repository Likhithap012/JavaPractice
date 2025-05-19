package org.example;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class MergeJson {
    public static void main(String[] args) {
        // JSON 1
        String json1 = "{ \"name\": \"Likhitha\", \"age\": 21 }";
        JsonObject obj1 = JsonParser.parseString(json1).getAsJsonObject();
//“Parse the string into a generic JSON element, then treat it as a JSON object.”
        // JSON 2
        String json2 = "{ \"email\": \"likhitha@example.com\", \"city\": \"Hyderabad\" }";
        JsonObject obj2 = JsonParser.parseString(json2).getAsJsonObject();

        // Merge obj2 into obj1
        for (String key : obj2.keySet()) {
            obj1.add(key, obj2.get(key));
        }

        // Output merged JSON
        System.out.println("Merged JSON: " + obj1.toString());
    }
}
