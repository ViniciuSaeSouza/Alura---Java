package Desafios.Desafios05;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o limite do seu cartão: ");
        double saldo = input.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(saldo);

        int sair = 0;
        while (sair != 1){
            System.out.println("Qual o nome do produto: ");
            String produto = input.next();

            System.out.println("Qual o valor do produto: ");
            double valor = input.nextDouble();

            Compra compra = new Compra(produto, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);
            if(compraRealizada){
                System.out.println("Compra efetuada com sucesso! \nSeu saldo é: " + cartao.getSaldo());
                System.out.println("Deseja compra outro item? 0 - Sim / 1 - Não: ");
                sair = input.nextInt();
            }else {
                System.out.println("Você não possui saldo suficiente para esta compra\n Seu saldo é: " + cartao.getSaldo());
                System.out.println("Deseja comprar outro item? 0 - Sim / 1 - Não: ");
                sair = input.nextInt();
            }
            System.out.println("*******************************");
            System.out.println("Suas compras: ");
            for (Compra c: cartao.getCompras()){
                System.out.println(c.getProduto() + " - R$"+c.getValor());
            }
            System.out.println("*******************************");
            System.out.println("Saldo: " + cartao.getSaldo());
        }
    }
}
