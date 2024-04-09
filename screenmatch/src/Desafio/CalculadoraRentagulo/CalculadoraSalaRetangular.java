package Desafio.CalculadoraRentagulo;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double base, double altura){
        double area = (base * altura);
        System.out.println("Area: " + area);
    }
    @Override
    public void calcularPerimetro(double base, double altura){
        double perimetro = 2 * (base + altura);
        System.out.println("Perimetro: " + perimetro);
    }
}
