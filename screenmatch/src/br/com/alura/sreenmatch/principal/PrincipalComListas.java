package br.com.alura.sreenmatch.principal;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme01 = new Filme("O podereso chefão", 1970);
        filme01.avalia(9);
        Filme filme02 = new Filme("Moneyball", 2011);
        filme02.avalia(7.5);
        var filme03 = new Filme("Whiplash", 2014);
        filme03.avalia(8);
        Serie drHouse = new Serie("Dr.House", 2004);
        drHouse.avalia(8);
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme01);
        listaDeTitulos.add(filme02);
        listaDeTitulos.add(filme03);
        listaDeTitulos.add(drHouse);
        for (Titulo item:listaDeTitulos){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paul Rudd");
        buscarPorArtista.add("Hugh Laurie");
        buscarPorArtista.add("Zendaya");
        buscarPorArtista.add("Bob Kazamakis");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);

        System.out.println(buscarPorArtista);
        System.out.println(listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
    }
}
