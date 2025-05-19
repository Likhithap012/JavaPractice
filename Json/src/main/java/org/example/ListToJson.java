package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

// Car class with fields, constructor, getters and setters
class Cars {
    private String make;
    private String model;
    private int year;

    public Cars() {} // Default constructor needed for Jackson

    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
public class ListToJson {
    public static void main(String[] args) {
        try {
            // Create a list of Car objects
            List<Cars> cars = new ArrayList<>();
            cars.add(new Cars("Toyota", "Camry", 2020));
            cars.add(new Cars("Honda", "Civic", 2019));
            cars.add(new Cars("Ford", "Mustang", 2021));

            // Create ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();

            // Convert list to JSON string (JSON array)
            String jsonArray = mapper.writeValueAsString(cars);

            // Print JSON array
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
