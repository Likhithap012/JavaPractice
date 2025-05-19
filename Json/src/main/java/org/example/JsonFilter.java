package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
public class JsonFilter {
    public static void main(String[] args) {
        String json = """
                [
                  {"name": "Alice", "age": 30},
                  {"name": "Bob", "age": 22},
                  {"name": "Charlie", "age": 28}
                ]
                """;

        try {
            ObjectMapper mapper = new ObjectMapper();

            // Parse JSON string into a JsonNode (root is an array)
            ArrayNode arrayNode = (ArrayNode) mapper.readTree(json);

            // Create new ArrayNode for filtered results
            ArrayNode filteredArray = mapper.createArrayNode();

            // Iterate and filter
            for (JsonNode node : arrayNode) {
                int age = node.get("age").asInt();
                if (age > 25) {
                    filteredArray.add(node);
                }
            }

            // Print filtered JSON array as string
            String resultJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredArray);
            System.out.println(resultJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
