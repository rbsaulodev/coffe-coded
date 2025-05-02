package br.com.alura.desafio.model;

public class Podcast extends Audio {
    private String apresentador;
    private int numeroEpisodio;

    public Podcast(String titulo, int duracaoEmSegundos, String apresentador, int numeroEpisodio) {
        super(titulo, duracaoEmSegundos);
        this.apresentador = apresentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    @Override
    public String getTipo() {
        return "Podcast";
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Episódio nº: " + numeroEpisodio);
    }
}
