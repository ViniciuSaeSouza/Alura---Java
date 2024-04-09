package Desafio.ConversaoMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorEmDolar){
        double cotacaoDolar = 5.01;
        double valorEmreal = valorEmDolar * cotacaoDolar;
        System.out.println("R$" + valorEmreal + " reais.");
    }

//    @Override
//    public double converterDolarParaReal() {
//        return 0;
//    }
}
