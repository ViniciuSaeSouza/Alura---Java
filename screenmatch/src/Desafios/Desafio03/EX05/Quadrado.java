package Desafios.Desafio03.EX05;

public class Quadrado implements Forma{
    double lado;

    @Override
    public String toString() {
        return "Quadrado";
    }

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }
}
