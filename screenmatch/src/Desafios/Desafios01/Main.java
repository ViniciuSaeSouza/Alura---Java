package Desafios.Desafios01;

import Desafios.Desafios01.CalculadoraRentagulo.CalculadoraSalaRetangular;
import Desafios.Desafios01.CalcularPreco.Livro;
import Desafios.Desafios01.ConversaoMoeda.ConversorMoeda;
import Desafios.Desafios01.ConversorTemperatura.ConversorTemperaturaPadrao;
import Desafios.Desafios01.Tabuada.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(1000);

        CalculadoraSalaRetangular calculadoraRentagular = new CalculadoraSalaRetangular();
        calculadoraRentagular.calcularArea(1,1);
        calculadoraRentagular.calcularPerimetro(1,1);
        calculadoraRentagular.calcularArea(10,5);
        calculadoraRentagular.calcularPerimetro(10,5);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(32);
        conversorTemperatura.fahrenheitParaCelsius(32);

        Livro livro = new Livro();
        livro.calcularPrecoFinal(10);
    }
}