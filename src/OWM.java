package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class OWM {
    private static JSONObject getJsonObject(String location) throws IOException {
        String key = "8324540866cbe4244662ae883059cdd8";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + key + "&units=metric";

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder responseContent = new StringBuilder();


        while ((line = reader.readLine()) != null) {
            responseContent.append(line);
        }
        reader.close();

        return new JSONObject(responseContent.toString());
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city name: - e.g Cambridge, UK (otherwise defaults to USA)");
        String location = scanner.nextLine();

        JSONObject currentData = getJsonObject(location);

        //Page 1 - Current data
        long unixSunrise = currentData.getJSONObject("sys").getLong("sunrise") * 1000;
        long unixSunset = currentData.getJSONObject("sys").getLong("sunset") * 1000;

        String sunrise = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(unixSunrise));
        String sunset = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(unixSunset));

        double temp = currentData.getJSONObject("main").getDouble("temp");

        System.out.println(temp);

        System.out.println(sunrise);
        System.out.println(sunset);

    }

}
