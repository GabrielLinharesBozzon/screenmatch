package br.com.alura.principal;

import br.com.alura.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para filme: ");
        var busca = leitura.nextLine();
        String endereco = "http://www.omdbapi.com/?t="+busca+"&apikey=2db9c1f8";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requeest = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(requeest,HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println( json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println(meuTitulo);


    }
}
