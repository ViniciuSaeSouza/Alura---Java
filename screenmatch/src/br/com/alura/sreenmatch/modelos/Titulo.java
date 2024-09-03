package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.exececao.ExcecaoAnoInvalidoException;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Titulo implements Comparable<Titulo>{

    private String nome;

    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(){};

//    Titulo Omdb constructor
    public Titulo(TituloOmdb meuTituloOmdb){
        this.nome = meuTituloOmdb.title();

        // Se o ano vier com mais de 4 números (ex: '2018-')
        if (meuTituloOmdb.year().length() > 4){
            throw new ExcecaoAnoInvalidoException("Não consegui converter o ano em inteiro. ");
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }


//Getters

    public int getTotalDeAvaliacoes(){

        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

//Setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //Métodos
    public void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(@NotNull Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\nAno de lançamento: " + getAnoDeLancamento();
    }
}
