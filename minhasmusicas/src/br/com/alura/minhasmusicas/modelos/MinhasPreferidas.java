package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está entra as preferidas do momento!");
        }else {
            System.out.println(audio.getTitulo() + " está valendo a pena conhecer!");
        }
    }
}
