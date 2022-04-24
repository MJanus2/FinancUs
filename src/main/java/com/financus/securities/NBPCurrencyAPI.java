package com.financus.securities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class NBPCurrencyAPI {

    public NBP getCurrencyRateFromASpecificDate(String date) throws URISyntaxException, IOException, InterruptedException {
        Gson gson = new Gson();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("http://api.nbp.pl/api/exchangerates/rates/c/usd/" + date + "/?format=json"))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        NBP nbp = gson.fromJson(response.body(), NBP.class);
        return nbp;
    }
}

class NBP {
    String currency;
    String code;
    @SerializedName("rates")
    List<Rates> rate;

    @Override
    public String toString() {
        return "NBP{" +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rate=" + rate +
                '}';
    }
}

class Rates {

    float ask;

    @Override
    public String toString() {
        return "Rates{" +
                "ask=" + ask +
                '}';
    }
}



