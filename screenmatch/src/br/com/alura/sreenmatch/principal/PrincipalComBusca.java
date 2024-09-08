package br.com.alura.sreenmatch.principal;

import br.com.alura.sreenmatch.exececao.ExcecaoAnoInvalidoException;
import br.com.alura.sreenmatch.modelos.Titulo;
import br.com.alura.sreenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String title = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!title.equalsIgnoreCase("sair")) {
            System.out.print("Título: ");
            title = sc.next();
            if (title.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + title + "&apikey=da948075";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());
                String json = response.body(); // Atribui á variável 'json' o json do método response.body()
//                System.out.println(json);
//              Gson gson = new Gson(); Gson sem builder


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
//                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido");
                System.out.println(meuTitulo);

                titulos.add((meuTitulo));

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (ExcecaoAnoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
    }
}
