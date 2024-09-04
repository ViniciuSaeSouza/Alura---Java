package Desafios.Desafios07.ExGitHubAPI;

public class ErroConsultaGitHub extends RuntimeException {
    String mensagem;
    public ErroConsultaGitHub(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
