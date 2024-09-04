package Desafios.Desafios07.ExGitHubAPI;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GitHubEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Usuário: ");
        //String user = sc.nextLine();
        String user = "ViniciuSaeSouza";
        user = user.replace(" ", "");
//        System.out.println(user);
        String url = "https://api.github.com/users/" + user;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404){
                throw new ErroConsultaGitHub("ERRO! Usuário não encontrado.");
            }
            String json = response.body();

            Gson gson = new Gson();
            GitHubUserRecord userRecord = gson.fromJson(json, GitHubUserRecord.class);
            MyGitHubUserClass userTest = new MyGitHubUserClass(userRecord);
            Object teste = gson.fromJson(json, Object.class);
            System.out.println(teste);
            System.out.println();
            System.out.println(userTest.toString());
    } catch(InterruptedException | IOException e){
            e.getMessage();
        }
    }
}
