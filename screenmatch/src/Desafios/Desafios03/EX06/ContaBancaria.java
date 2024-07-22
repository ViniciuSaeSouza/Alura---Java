package Desafios.Desafios03.EX06;

public class ContaBancaria {
    private int numeroConta;

    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria: "+ numeroConta;
    }

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
