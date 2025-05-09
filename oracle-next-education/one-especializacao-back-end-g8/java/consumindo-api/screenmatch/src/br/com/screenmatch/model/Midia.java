package br.com.screenmatch.model;

public abstract class Midia {
    protected String titulo;
    protected String ano;
    protected String genero;
    protected String diretor;
    protected String atores;
    protected String sinopse;
    protected String idioma;
    protected String pais;
    protected String premios;
    protected String posterUrl;
    protected String imdbNota;

    public Midia(String titulo, String ano, String genero, String diretor, String atores, String sinopse,
                 String idioma, String pais, String premios, String posterUrl, String imdbNota) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = atores;
        this.sinopse = sinopse;
        this.idioma = idioma;
        this.pais = pais;
        this.premios = premios;
        this.posterUrl = posterUrl;
        this.imdbNota = imdbNota;
    }

    public abstract String getTipo(); // filme ou série

    // Getters para o front-end acessar
    public String getTitulo() { return titulo; }
    public String getAno() { return ano; }
    public String getGenero() { return genero; }
    public String getDiretor() { return diretor; }
    public String getAtores() { return atores; }
    public String getSinopse() { return sinopse; }
    public String getIdioma() { return idioma; }
    public String getPais() { return pais; }
    public String getPremios() { return premios; }
    public String getPosterUrl() { return posterUrl; }
    public String getImdbNota() { return imdbNota; }
}
