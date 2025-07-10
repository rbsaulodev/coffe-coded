package br.com.alura.challenge_literAlura.service;

import br.com.alura.challenge_literAlura.model.ApiResponse;
import br.com.alura.challenge_literAlura.model.Author;
import br.com.alura.challenge_literAlura.model.Book;
import br.com.alura.challenge_literAlura.model.dto.BookDTO;
import br.com.alura.challenge_literAlura.model.dto.BookData;
import br.com.alura.challenge_literAlura.model.mapper.BookMapper;
import br.com.alura.challenge_literAlura.repository.AuthorRepository;
import br.com.alura.challenge_literAlura.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final ConsumoApiService consumoApiService = new ConsumoApiService();
    private final ConverteDados conversor = new ConverteDados();
    private final String URL_BASE = "https://gutendex.com/books/";

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Book searchAndSaveBookByTitle(String title) {

        Optional<Book> existingBook = bookRepository.findByTitleContainingIgnoreCase(title);
        if (existingBook.isPresent()) {
            System.out.println("Livro já cadastrado no banco de dados.");
            return existingBook.get();
        }

        System.out.println("Buscando livro na API...");
        var searchUrl = URL_BASE + "?search=" + URLEncoder.encode(title, StandardCharsets.UTF_8);
        try {
            var json = consumoApiService.obterDados(searchUrl);
            ApiResponse apiResponse = conversor.obterDados(json, ApiResponse.class);

            if (apiResponse != null && apiResponse.results() != null && !apiResponse.results().isEmpty()) {
                BookData bookData = apiResponse.results().get(0);
                Author author = processAuthor(bookData);
                Book newBook = new Book(
                        bookData.title(),
                        bookData.languages(),
                        bookData.downloadCount(),
                        author
                );
                System.out.println("Livro encontrado e salvo no banco de dados!");
                return bookRepository.save(newBook);
            } else {
                System.out.println("Nenhum livro encontrado na API com o título: " + title);
            }
        } catch (Exception e) {
            System.err.println("Erro ao buscar ou salvar livro: " + e.getMessage());
        }

        return null;
    }

    public List<BookDTO> listAllBooks(){
        return bookRepository.findAll()
                .stream()
                .map(BookMapper::toDTO)
                .toList();
    }

    public List<BookDTO> listBooksByLanguage(String language) {
        List<Book> books = bookRepository.findByLanguagesContaining(language);
        return books.stream()
                .map(BookMapper::toDTO)
                .toList();
    }

    private Author processAuthor(BookData bookData) {
        if (bookData.authors() == null || bookData.authors().isEmpty()) {
            return authorRepository.findByNameContainingIgnoreCase("Desconhecido")
                    .orElseGet(() -> authorRepository.save(new Author("Desconhecido", null, null)));
        }

        var authorData = bookData.authors().get(0);
        Optional<Author> existingAuthor = authorRepository.findByNameContainingIgnoreCase(authorData.name());
        return existingAuthor.orElseGet(() -> {
            Author newAuthor = new Author(
                    authorData.name(),
                    authorData.birthYear(),
                    authorData.deathYear()
            );
            return authorRepository.save(newAuthor);
        });
    }
}
