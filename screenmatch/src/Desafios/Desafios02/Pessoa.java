package Desafios.Desafios02;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {}

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", " + this.idade + " anos";
    }
}
