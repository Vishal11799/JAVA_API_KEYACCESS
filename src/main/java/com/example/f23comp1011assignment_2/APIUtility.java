package com.example.f23comp1011assignment_2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    /**
     * This method will call the OMDB API with a movie title passed in as an argument
     */
    public static void callAPI(String carName) throws IOException, InterruptedException {
        //if we received "Star Wars", we need to translate that to be "Star%20Wars"
        carName = carName.replaceAll(" ", "%20");

        String uri = "https://vpic.nhtsa.dot.gov/api/vehicles/GetVehicleTypesForMake/"+carName +"?format=json";

        //configure the environment to make a HTTP request (this includes an update to the
        //module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //this will save a file called movies.json with the API's response
        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
                .ofFile(Paths.get("carNames.json")));}

}