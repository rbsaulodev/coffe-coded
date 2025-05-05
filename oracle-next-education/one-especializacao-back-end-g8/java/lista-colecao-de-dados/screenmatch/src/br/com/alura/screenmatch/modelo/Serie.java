package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

import java.text.DecimalFormat;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int quantidadeDeEpPorTemporada;

    private DecimalFormat df = new DecimalFormat("#.00");

    public Serie(String nome, int anoDeLancamento, int duracao, int temporadas, boolean ativa, int quantidadeDeEpPorTemporada) {
        super(nome, anoDeLancamento, duracao);
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.quantidadeDeEpPorTemporada = quantidadeDeEpPorTemporada;
    }

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public double calcularTotalDeHoras() {
        return (double) (super.getDuracao() * quantidadeDeEpPorTemporada) / 60;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Série está ativa: " + ativa);
        System.out.println("Quantidade de episódios por temporada: " + quantidadeDeEpPorTemporada);
        System.out.println("Horas no total da série: " + df.format(calcularTotalDeHoras()));
    }

    @Override
    public int getClassifcavel() {
        return (int) (getMedia() / 2);
    }
}
