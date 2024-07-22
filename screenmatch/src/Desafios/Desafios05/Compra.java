package Desafios.Desafios05;

public class Compra {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.produto + " - Valor: " + this.valor;
    }
}
