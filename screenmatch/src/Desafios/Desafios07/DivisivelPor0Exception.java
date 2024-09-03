package Desafios.Desafios07;

import java.util.Scanner;

public class DivisivelPor0Exception {
    static int a;
    static int b;

    public static void divideAporB(int a, int b){
        try{
            float result = a / b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Erro de divisão. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        a = sc.nextInt();
        System.out.println("B: ");
        b = sc.nextInt();
        divideAporB(a,b);
    }
}
