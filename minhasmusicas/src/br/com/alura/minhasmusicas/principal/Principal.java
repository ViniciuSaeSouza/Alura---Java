package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Flower");
        minhaMusica.setCantor("Post Malone");
        minhaMusica.setAlbum("Spider-Man");
        minhaMusica.setGenero("Pop");

        for (int i = 0; i < 500; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i< 100; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setHost("Igão e Mítico");

        for (int i = 0; i < 500; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
