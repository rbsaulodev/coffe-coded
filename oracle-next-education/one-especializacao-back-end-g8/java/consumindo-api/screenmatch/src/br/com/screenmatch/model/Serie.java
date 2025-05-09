package br.com.screenmatch.model;

public class Serie extends Midia {
    private int temporadas;
    private int episodios;

    public Serie(String titulo, String ano, String genero, String diretor, String atores, String sinopse,
                 String idioma, String pais, String premios, String posterUrl, String imdbNota,
                 int temporadas, int episodios) {
        super(titulo, ano, genero, diretor, atores, sinopse, idioma, pais, premios, posterUrl, imdbNota);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    @Override
    public String getTipo() {
        return "Série";
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }
}
