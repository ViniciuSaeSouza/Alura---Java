package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nomeFilme, int anoDeLancamento){
        super(nomeFilme, anoDeLancamento);
    }


    //public Filme(){};

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }


    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
