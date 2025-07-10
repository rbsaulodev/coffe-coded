package br.com.alura.challenge_literAlura.model.mapper;

import br.com.alura.challenge_literAlura.model.Author;
import br.com.alura.challenge_literAlura.model.Book;
import br.com.alura.challenge_literAlura.model.dto.BookDTO;

import java.util.Collections;

public class BookMapper {

    public static BookDTO toDTO(Book book) {
        if (book == null) {
            return null;
        }

        return new BookDTO(
                book.getTitle(),
                Collections.singletonList(AuthorMapper.toDTO(book.getAuthor())),
                book.getLanguages(),
                book.getDownloadCount()
        );
    }

    public static Book toEntity(BookDTO bookDTO) {
        if (bookDTO == null) {
            return null;
        }
        Book bookEntity = new Book();
        bookEntity.setTitle(bookDTO.title());
        bookEntity.setLanguages(bookDTO.languages());
        bookEntity.setDownloadCount(bookDTO.downloadCount());

        if (bookDTO.authors() != null && !bookDTO.authors().isEmpty()) {
            Author authorEntity = AuthorMapper.toEntity(bookDTO.authors().get(0));
            bookEntity.setAuthor(authorEntity);
        }
        return bookEntity;
    }
}
