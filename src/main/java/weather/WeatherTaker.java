package weather;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherTaker {
    public OpenWeather takeWeather(String cityName) throws URISyntaxException, IOException, InterruptedException {
        Gson gson = new Gson();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=baa6ece140be0985d8bf8766fa381d1d&units=metric"))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        OpenWeather openWeather = gson.fromJson(response.body(), OpenWeather.class);
        System.out.println(openWeather);
return openWeather;
    }

}

