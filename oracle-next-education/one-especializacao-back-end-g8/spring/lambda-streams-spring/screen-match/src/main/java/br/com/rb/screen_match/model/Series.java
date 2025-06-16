package br.com.rb.screen_match.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Series
        (@JsonAlias("Title") String titulo,
         @JsonAlias("totalSeasons") Integer totalTemporadas,
         @JsonAlias("imdbRating") String avaliacao){
}
