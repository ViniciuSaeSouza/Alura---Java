package Desafios.Desafios06;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Título: ");
        var titulo = sc.next();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+ titulo + "&key=AIzaSyCWVp2yMwsxJ23DPcrLovFOruFwMtGAYEI";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
        Gson gson = new Gson();
        LivroGoogle livroGoogle = gson.fromJson(json, LivroGoogle.class);
        System.out.println(livroGoogle.title());
    }
}
