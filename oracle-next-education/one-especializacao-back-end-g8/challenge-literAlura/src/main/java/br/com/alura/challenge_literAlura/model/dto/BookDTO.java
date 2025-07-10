package br.com.alura.challenge_literAlura.model.dto;

import java.util.List;

public record BookDTO(
        String title,
        List<AuthorDTO> authors,
        List<String> languages,
        int downloadCount
) {
}