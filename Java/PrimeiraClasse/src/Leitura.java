import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();

        System.out.println("Qual o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação do filme: ");
        double avaliacaoDoFilme = leitura.nextDouble();

        System.out.println(filmeFavorito +" "+anoDeLancamento + " " + avaliacaoDoFilme);
    }
}
