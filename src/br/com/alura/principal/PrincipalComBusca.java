package br.com.alura.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requeest = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=lord_of_the_rings&apikey=2db9c1f8"))
                .build();
        HttpResponse<String> response = client
                .send(requeest,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        
    }
}
