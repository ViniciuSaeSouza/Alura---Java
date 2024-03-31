package br.com.alura.sreenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    //Get Set Temporadas
    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    //Get Set Episodios por temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    //Get Set Ativa (série ainda está passando)
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    //Get Set Minutos por episodio
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
