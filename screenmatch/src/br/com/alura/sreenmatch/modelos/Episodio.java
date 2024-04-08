package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    private int totalVisualizacoes;

    @Override
    public int getClassificacao(){
        if (totalVisualizacoes > 100) {
            return 4;
        }else {
            return 2;
        }

    }
}
