package Desafios.Desafios02;

public class Produto {

    private String nome;
    private double preco;

    private int quantidadeProdutos;

    public Produto() {
    }

    public Produto(String nome){
        this.nome = nome;
    }

    public Produto(String nome, double preco, int quantidadeProdutos) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos){
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeProdutos(){
        return quantidadeProdutos;
    }
    @Override
    public String toString(){
        return "Nome: " + getNome() + " || Preço: " + getPreco() + " || Quantidade: " + getQuantidadeProdutos();
    }
}
