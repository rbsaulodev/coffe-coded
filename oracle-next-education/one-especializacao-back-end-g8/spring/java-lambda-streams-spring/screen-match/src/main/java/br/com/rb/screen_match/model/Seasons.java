package br.com.rb.screen_match.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Seasons
        (@JsonAlias("Season") Integer numero,
         @JsonAlias("Episodes") List<Episodes> episodes) {
}
