import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = sc.nextDouble();
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " , e a temperatura em Farenheit é: " +temperaturaFarenheit);
    }
}
