package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracao, String diretor) {
        super(nome, anoDeLancamento, duracao);
        this.diretor = diretor;
    }

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Diretor: " + diretor);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassifcavel() {
        return (int) (getMedia() / 2);
    }
}
