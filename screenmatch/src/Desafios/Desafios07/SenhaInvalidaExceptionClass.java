package Desafios.Desafios07;

import Desafios.Desafios07.excecao.SenhaInvalidaException;

import java.util.Scanner;

public class SenhaInvalidaExceptionClass {
    private static String senha;

    static Scanner sc = new Scanner(System.in);

    public String getSenha() {
        return senha;
    }

    public static void defineSenha(String s){
        if (s.length() < 8){
            throw new SenhaInvalidaException("Senha precisa ter 8 ou mais caracteres!");
        }else {
            System.out.println("Senha definida com sucesso!");
            senha = s;
        }
    }

    public static void main(String[] args) {
        SenhaInvalidaExceptionClass.defineSenha("1234");
    }
}
