package Desafios.Desafios07.excecao;

import javax.swing.*;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
