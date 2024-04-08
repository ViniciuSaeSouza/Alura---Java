import br.com.alura.sreenmatch.modelos.*;
import br.com.alura.sreenmatch.calculos.*;


public class Principal {
    public static void main(String[] args) {
       /* Filme filme01 = new Filme();
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
        System.out.println("Média das avaliações: " + filme01.pegaMedia());*/

        Serie drHouse = new Serie();
        drHouse.setNome("Dr.House");
        drHouse.setAnoDeLancamento(2004);
        drHouse.exibiFichaTecnica();
        drHouse.setTemporadas(8);
        drHouse.setEpisodiosPorTemporada(10);
        drHouse.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar House: " + drHouse.getDuracaoEmMinutos());

        Filme filme01 = new Filme();
        filme01.setNome("O podereso chefão");
        filme01.setAnoDeLancamento(1970);
        filme01.setDuracaoEmMinutos(180);

        Filme filme02 = new Filme();
        filme02.setNome("O podereso chefão 2");
        filme02.setAnoDeLancamento(1974);
        filme02.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme01);
        calculadora.inclui(filme02);
        calculadora.inclui(drHouse);
        System.out.println("Duração total: " + calculadora.getTempoTotal());
    }
}