import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
//    Utilizando o While
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int numeroAleatorio = new Random().nextInt(100);
//        int tentativas = 0;
//
//        //System.out.println(numeroAleatorio);
//
//        while (tentativas < 10) {
//            System.out.println("Digite o número que eu pensei: ");
//            int palpite = input.nextInt();
//            tentativas++;
//            if (palpite == numeroAleatorio) {
//                System.out.println("Parabéns, você acertou! O número que eu pensei era: " + numeroAleatorio);
//                //tentativas = 5;
//                break;
//            } else if (palpite < numeroAleatorio) {
//                System.out.println("O número digitado é menor que o número que eu pensei!");
//            } else {
//                System.out.println("O número digitado é maior que o número que eu pensei!");
//            }
//        }
//    }
    //Utilizando for:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int palpite = 0;

        for (int tentativas = 0; tentativas < 10; tentativas++) {
            System.out.println("Digite o número que eu pensei: ");
            palpite = input.nextInt();
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns, você acertou! O número que eu pensei era: " + numeroAleatorio);
                //tentativas = 0;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número que eu pensei!");
            } else {
                System.out.println("O número digitado é maior que o número que eu pensei!");
            }
        }
    }
}
