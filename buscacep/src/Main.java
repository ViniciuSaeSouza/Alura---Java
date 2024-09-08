import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        String cep = sc.nextLine();
        ConsultaCEP consulta = new ConsultaCEP();

        try{
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.criaArquivoJson(novoEndereco);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }
    }
}
