package Desafios.Desafios03.EX04;

public class Produto {
    private String nome;
    private double preco;

    //Construtor genérico
    Produto (){};

    //Construtor com atributos
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
}
