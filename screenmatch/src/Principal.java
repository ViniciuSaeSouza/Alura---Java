import br.com.alura.sreenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.setNome("O podereso chefão");
        filme01.setAnoDeLancamento(1970);
        filme01.setDuracaoEmMinutos(180);

        filme01.exibiFichaTecnica();
        filme01.avalia(8);
        filme01.avalia(7);
        filme01.avalia(10);
        //System.out.println(filme01.somaDasAvaliacoes);
        //filme01.somaDasAvaliacoes = 10;
        //filme01.totalDeAvaliacoes = 1;
        System.out.println("Total de avaliações: " + filme01.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme01.pegaMedia());
    }
}