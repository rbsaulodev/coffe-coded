package br.com.alura.challenge_literAlura.model.mapper;

import br.com.alura.challenge_literAlura.model.Author;
import br.com.alura.challenge_literAlura.model.dto.AuthorDTO;

/**
 * Classe responsável por mapear (converter) objetos Author.
 * Converte entre a entidade Author e o AuthorDTO.
 */
public class AuthorMapper {

    /**
     * Converte uma entidade Author para um AuthorDTO.
     * @param author A entidade Author a ser convertida.
     * @return O AuthorDTO correspondente.
     */
    public static AuthorDTO toDTO(Author author) {
        if (author == null) {
            return null;
        }
        return new AuthorDTO(
                author.getName(),
                author.getBirthYear(),
                author.getDeathYear()
        );
    }

    /**
     * Converte um AuthorDTO para uma entidade Author.
     * @param authorDTO O DTO a ser convertido.
     * @return A entidade Author correspondente.
     */
    public static Author toEntity(AuthorDTO authorDTO) {
        if (authorDTO == null) {
            return null;
        }
        // Utiliza o construtor da entidade para criar uma nova instância.
        return new Author(
                authorDTO.name(),
                authorDTO.birthYear(),
                authorDTO.deathYear()
        );
    }
}
