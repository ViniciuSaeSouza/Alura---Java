import java.util.Scanner;

public class ProjetoMiniBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu Nome e Sobrenome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Digite se sua conta é Corrente ou Poupança: ");
        String tipoDeConta = input.nextLine();

        System.out.println("Digite seu saldo inicial: ");
        double saldoInicial = input.nextDouble();
        double saldoAtual = saldoInicial;
        //System.out.println(" ");
        System.out.println("\n****************************************************************");
        System.out.println("Dados iniciais do Cliente ");
        System.out.println("Nome:                          " + nomeCliente);
        System.out.println("Tipo Conta:                    " + tipoDeConta);
        System.out.println("Saldo Inicial:                 " + "R$" + saldoAtual);
        System.out.println("****************************************************************\n");


        int operacaoEscolhida = 0;
        while (operacaoEscolhida != 4) {
            System.out.println("Operações\n");
            System.out.println("""
                    1- Consultar Saldo
                    2- Receber Valor
                    3- Transferir Valor
                    4- Encerrar""");

            System.out.println("Digite a operação escolhida: ");
            operacaoEscolhida = input.nextInt();
            switch (operacaoEscolhida) {
                case 1:
                    System.out.println("O saldo atual é: R$" + saldoAtual+"\n");

                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    double valorRecebido = input.nextDouble();
                    saldoAtual += valorRecebido;
                    System.out.println("O saldo atualizado é: R$" + saldoAtual+"\n");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > saldoAtual){
                        System.out.println("Não há saldo suficiente para esta operação: ");
                        System.out.println("Seu saldo atual é: R$" + saldoAtual+"\n");
                        break;
                    } else {
                        saldoAtual -= valorTransferido;
                        System.out.println("O saldo atualizado é: R$" + saldoAtual+"\n");
                        break;
                    }
                case 4:
                    break;

                default:
                    System.out.println("Opção escolhida Inválida!");
            }
        }
    }
}