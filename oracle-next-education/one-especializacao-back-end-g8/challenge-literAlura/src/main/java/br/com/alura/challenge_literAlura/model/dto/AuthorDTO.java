package br.com.alura.challenge_literAlura.model.dto;

public record AuthorDTO(
        String name,
        Integer birthYear,
        Integer deathYear
) {
}
