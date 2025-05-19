package org.example;
import com.google.gson.Gson;
public class CarToJson {
    public static void main(String[] args) {
        Cars car = new Cars("Tesla", "Model 3", 2022);

        Gson gson = new Gson();
        String json = gson.toJson(car);

        System.out.println(json);
    }
}
