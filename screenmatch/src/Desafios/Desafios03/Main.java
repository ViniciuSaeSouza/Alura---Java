package Desafios.Desafios03;

import Desafios.Desafios03.EX02.Animal;
import Desafios.Desafios03.EX02.Cachorro;
import Desafios.Desafios03.EX04.Produto;
import Desafios.Desafios03.EX05.*;
import Desafios.Desafios03.EX06.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        if (cachorro instanceof Cachorro) {
            Cachorro animal = (Cachorro) cachorro;
        }

        Produto p1 = new Produto("Caneta", 2.00);
        Produto p2 = new Produto("Chocolate", 2.50);
        Produto p3 = new Produto("Controle", 50.00);
        Produto p4 = new Produto("Chuteira", 100.00);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);

        double somaPrecos = 0;
        for (Produto item: listaProdutos){
            somaPrecos += item.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

        Forma circulo = new Circulo(3);
        Forma quadrado = new Quadrado(4);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);
        for (Forma item: listaDeFormas){
            System.out.println("Área do " + item +" "+ String.format("%.2f",item.calcularArea()));
        }

        ContaBancaria conta01 = new ContaBancaria(123, 100.00);
        ContaBancaria conta02 = new ContaBancaria(432, 200.00);
        ContaBancaria conta03 = new ContaBancaria(567, 500.00);
        ContaBancaria conta04 = new ContaBancaria(809, -600.00);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta01);
        listaDeContas.add(conta02);
        listaDeContas.add(conta03);
        listaDeContas.add(conta04);

        ContaBancaria maiorSaldo = listaDeContas.getFirst();
        for (ContaBancaria conta: listaDeContas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
            }
        }
        System.out.println("A conta com o maior saldo é, " + maiorSaldo + ", com um saldo de: " + maiorSaldo.getSaldo());

    }
}
