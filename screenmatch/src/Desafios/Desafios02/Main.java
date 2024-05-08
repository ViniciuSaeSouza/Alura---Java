package Desafios.Desafios02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa01 = new Pessoa("Luigi", 20);
        Pessoa pessoa02 = new Pessoa("Anderson", 30);
        Pessoa pessoa03 = new Pessoa("Vinicius", 28);

        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);
        System.out.println(pessoas);
        System.out.println("Primeiro nome: "+pessoas.get(1).toString());
        System.out.println("Tamanho da lista: " + pessoas.size());
    }
}
