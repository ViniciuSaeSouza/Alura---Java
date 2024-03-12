public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 6.5 + notaDoFilme) / 4;
        System.out.println(media);
        String sinopse = """
                Filme de aventura
                Com galã dos anos 80
                Ruim e pra velho
                Ano de lançamento:
                """+ anoDeLancamento;
        //Comentário de linha única.
        System.out.println(sinopse);
        /*Comentário
          De mais de uma linha
         */

    }
}