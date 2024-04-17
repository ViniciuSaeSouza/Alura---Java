package Desafios.Desafios01.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    public void celsiusParaFahrenheit(double temperatura){
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println("A temperatura " + temperatura + "C° em graus Fahrenheit é: " + fahrenheit + "F°");
    }

    public void fahrenheitParaCelsius(double temperatura){
        double celsius = (temperatura - 32) / 1.8;
        System.out.println("A temperatura " + temperatura + "F° em graus Celsius é: " + celsius + "C°");
    }
}
