package Desafios.Desafios04.EX01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(8);
        listaDeInteiros.add(9);
        listaDeInteiros.add(23);
        listaDeInteiros.add(24);
        listaDeInteiros.add(1);
        listaDeInteiros.add(33);
        listaDeInteiros.add(95);
        // Imprime a listaDeInteiros de maneira não ordenada
        System.out.println("Lista 'listaDeInteiros' não ordenada: " + listaDeInteiros);

        //Ordena a listaDeInteiros em ordem crescente por default
        Collections.sort(listaDeInteiros);
        System.out.println("Lista 'listaDeInteiros' ordenada em ordem crescente: " + listaDeInteiros);

        //Ordena a listaDeInteiros de em ordem decrescente(reversa)
        Collections.reverse(listaDeInteiros);
        System.out.println("Lista 'listaDeInteiros' ordenada em ordem decrescente(reversa): " + listaDeInteiros);
    }
}
