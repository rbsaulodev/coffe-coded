package br.com.alura.challenge_literAlura.model;

import br.com.alura.challenge_literAlura.model.dto.BookData;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiResponse(
        @JsonAlias("results")List<BookData> results
        ) {
}

