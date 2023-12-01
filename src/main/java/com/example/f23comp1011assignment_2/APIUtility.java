package com.example.f23comp1011assignment_2;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIUtility {

    public static List<Car> callAPI(String carName) throws IOException, InterruptedException {
        carName = carName.replaceAll(" ", "%20");

        String uri = "https://vpic.nhtsa.dot.gov/api/vehicles/GetVehicleTypesForMake/" + carName + "?format=json";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonElement jsonElement = gson.fromJson(httpResponse.body(), JsonElement.class);

        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonArray("Results");

            Type carListType = new TypeToken<List<Car>>() {}.getType();
            return gson.fromJson(jsonArray, carListType);
        } else {
            throw new JsonSyntaxException("Expected JSON object");
        }
    }
}
