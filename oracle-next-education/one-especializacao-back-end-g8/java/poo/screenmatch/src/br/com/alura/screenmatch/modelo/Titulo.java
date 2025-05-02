package br.com.alura.screenmatch.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Titulo {
    private String nome;
    private ArrayList<Integer> avaliacoes = new ArrayList<>();
    private double media;
    private int quantidadeDeAvaliacoes;
    private int anoDeLancamento;
    private int duracao; // Adicionado aqui!

    private DecimalFormat df = new DecimalFormat("#.00");

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(String nome, int anoDeLancamento, int duracao) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
    }

    public void adicionaAvaliacao(int valor) {
        this.avaliacoes.add(valor);
        this.quantidadeDeAvaliacoes++;
    }

    public void calculaMediaDeAvaliacoes() {
        int soma = 0;
        for (int a : avaliacoes) {
            soma += a;
        }
        this.media = (double) soma / this.quantidadeDeAvaliacoes;
    }

    public void mostraAvaliacoes() {
        System.out.print("Avaliações: ");
        for (int i = 0; i < avaliacoes.size(); i++) {
            System.out.print(avaliacoes.get(i));
            if (i < avaliacoes.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void imprimeInformacoes() {
        System.out.println();
        calculaMediaDeAvaliacoes();
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        if(this instanceof Filme){
            double horas = (double) duracao /60;
            System.out.println("Duração do Filme: " + df.format(horas));
        }else if (this instanceof Serie){
            System.out.println("Duração dos Ep: " + duracao + " horas");
        } else if (this instanceof Titulo ) {
            System.out.println("Tipo gênerico: " + duracao);
        }

        System.out.println("Média de avaliações: " + df.format(media));
        System.out.println("Quantidade de avaliações: " + quantidadeDeAvaliacoes);
        mostraAvaliacoes();
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

}
