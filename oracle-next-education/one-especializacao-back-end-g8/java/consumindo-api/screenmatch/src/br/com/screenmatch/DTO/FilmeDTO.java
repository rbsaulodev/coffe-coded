package br.com.screenmatch.DTO;

import com.google.gson.annotations.SerializedName;

public class FilmeDTO {
    @SerializedName("Title")
    private String titulo;

    @SerializedName("Year")
    private String ano;

    @SerializedName("Genre")
    private String genero;

    @SerializedName("Director")
    private String diretor;

    @SerializedName("Actors")
    private String atores;

    @SerializedName("Plot")
    private String sinopse;

    @SerializedName("Language")
    private String idioma;

    @SerializedName("Country")
    private String pais;

    @SerializedName("Awards")
    private String premios;

    @SerializedName("Poster")
    private String posterUrl;

    @SerializedName("imdbRating")
    private String imdbNota;

    // Getters
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
