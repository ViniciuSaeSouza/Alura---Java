package br.com.alura.sreenmatch.calculos;

import br.com.alura.sreenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inlcui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
