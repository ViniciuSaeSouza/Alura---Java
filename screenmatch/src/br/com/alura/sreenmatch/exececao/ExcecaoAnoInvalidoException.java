package br.com.alura.sreenmatch.exececao;

public class ExcecaoAnoInvalidoException extends RuntimeException {
    private String mensagem;
    public ExcecaoAnoInvalidoException(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
