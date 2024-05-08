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

        ////////////////////////////////////////////////////////////
        System.out.println("\n");
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        var cebola = new Produto("Cebola");
        var leite = new Produto("Leite");
        var chocolate = new Produto("Chocolate");

        listaDeProdutos.add(cebola);
        listaDeProdutos.add(leite);
        listaDeProdutos.add(chocolate);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2).getNome());

        var pao = new Produto("Pão", 5.99, 10);

        var carne = new ProdutoPerecivel("Carne", 50.00, 3, "08/09/1995");
        System.out.println(carne.toString());
    }
}
