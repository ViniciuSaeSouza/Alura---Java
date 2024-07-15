package Desafios.Desafio03.EX05;

public class Circulo implements Forma{
    double raio;

    @Override
    public String toString() {
        return "Círculo";
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
