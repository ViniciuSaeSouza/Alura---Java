package Desafios.Desafio03.EX01;

import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("Python");
        listaStrings.add("C++");

        for (String elemento: listaStrings){
            System.out.println(elemento);
        }
    }


}
