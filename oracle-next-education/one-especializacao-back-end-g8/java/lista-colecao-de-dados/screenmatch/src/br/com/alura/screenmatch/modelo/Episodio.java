package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeLikes;

    public Episodio(int numero, String nome, Serie serie) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }

    @Override
    public int getClassifcavel() {
        if (totalDeLikes > 500){
            return 5;
        } else if (totalDeLikes >= 350 && totalDeLikes < 500) {
            return 4;
        }else {
            return 3;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeLikes() {
        return totalDeLikes;
    }

    public void setTotalDeLikes(int totalDeLikes) {
        this.totalDeLikes = totalDeLikes;
    }
}
