package br.com.alura.challenge_literAlura.service;

import br.com.alura.challenge_literAlura.model.Author;
import br.com.alura.challenge_literAlura.model.dto.AuthorDTO;
import br.com.alura.challenge_literAlura.model.mapper.AuthorMapper;
import br.com.alura.challenge_literAlura.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorDTO> listAllAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(AuthorMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<AuthorDTO> listAuthorsAliveInYear(int year) {
        List<Author> authors = authorRepository.findAuthorsAliveInYear(year);
        return authors.stream()
                .map(AuthorMapper::toDTO)
                .collect(Collectors.toList());
    }
}
