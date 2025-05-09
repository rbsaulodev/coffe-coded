package br.com.screenmatch.model;

import br.com.screenmatch.DTO.FilmeDTO;

public class Filme extends Midia {

    public Filme(String titulo, String ano, String genero, String diretor, String atores, String sinopse,
                 String idioma, String pais, String premios, String posterUrl, String imdbNota) {
        super(titulo, ano, genero, diretor, atores, sinopse, idioma, pais, premios, posterUrl, imdbNota);
    }

    public Filme(FilmeDTO dto) {
        super(
                dto.getTitulo(),
                dto.getAno(),
                dto.getGenero(),
                dto.getDiretor(),
                dto.getAtores(),
                dto.getSinopse(),
                dto.getIdioma(),
                dto.getPais(),
                dto.getPremios(),
                dto.getPosterUrl(),
                dto.getImdbNota()
        );
    }

    @Override
    public String getTipo() {
        return "Filme";
    }
}
