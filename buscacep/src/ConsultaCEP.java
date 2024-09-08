import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import netscape.javascript.JSException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {

    public Endereco buscaEndereco(String cep) {
        URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder().
                uri(uri).
                build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obter o endereço a partir deste CEP: " + cep);
        }catch (Exception e){
            throw new RuntimeException("Não consegui obter o endereço deste CEP.");
        }
    }
}
