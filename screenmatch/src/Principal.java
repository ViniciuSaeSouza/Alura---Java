import br.com.alura.sreenmatch.modelos.*;
import br.com.alura.sreenmatch.calculos.*;

import java.util.ArrayList;


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

        Serie drHouse = new Serie("Dr.House",2004);
        //drHouse.setNome("Dr.House");
        //drHouse.setAnoDeLancamento(2004);
        drHouse.exibiFichaTecnica();
        drHouse.setTemporadas(8);
        drHouse.setEpisodiosPorTemporada(10);
        drHouse.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar House: " + drHouse.getDuracaoEmMinutos());

        Filme filme01 = new Filme("O podereso chefão",1970);
        //filme01.setNome("O podereso chefão");
        //filme01.setAnoDeLancamento(1970);
        filme01.setDuracaoEmMinutos(180);
        filme01.avalia(10);

        Filme filme02 = new Filme("Moneyball",2011);
        //filme02.setNome("Moneyball");
        //filme02.setAnoDeLancamento(2011);
        filme02.setDuracaoEmMinutos(133);
        filme02.avalia(8);

        var filme03 = new Filme("Whiplash",2014);
        //filme03.setNome("Whiplash");
        //filme03.setAnoDeLancamento(2014);
        filme03.setDuracaoEmMinutos(200);
        filme03.avalia(9.5);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme01);
        calculadora.inclui(filme02);
        calculadora.inclui(drHouse);
        System.out.println("Duração total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme01);
        filtro.filtra(filme02);


        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filme01);
        listaDeFilme.add(filme02);
        listaDeFilme.add(filme03);
        System.out.println("\nTamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro Filme: " + listaDeFilme.get(0).getNome());
        System.out.println("Segundo Filme: " + listaDeFilme.get(1).getNome());
        System.out.println("Terceiro Filme: " + listaDeFilme.get(2).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString: " + listaDeFilme.get(0).toString());
    }
}