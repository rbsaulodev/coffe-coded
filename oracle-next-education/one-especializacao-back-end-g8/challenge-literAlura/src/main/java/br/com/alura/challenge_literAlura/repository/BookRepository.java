package br.com.alura.challenge_literAlura.repository;

import br.com.alura.challenge_literAlura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByLanguagesContaining(String language);
}
