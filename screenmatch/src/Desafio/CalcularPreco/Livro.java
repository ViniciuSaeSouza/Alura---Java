package Desafio.CalcularPreco;

public class Livro implements Calculavel{
    public void calcularPrecoFinal(double valor){
        double precoFinal = valor * 0.9;
        System.out.println(precoFinal);
    }
}
