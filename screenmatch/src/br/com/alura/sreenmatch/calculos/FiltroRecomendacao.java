package br.com.alura.sreenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os mais bem avaliados");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para assistir depois!");
        }
    }


}
