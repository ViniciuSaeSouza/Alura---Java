package Desafios.Desafios06;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String json = """
                {
                    "nome" : "Saes",
                    "idade" : 28,
                    "cidade" : "São Paulo"
                }
                """;


        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
