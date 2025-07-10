package br.com.alura.challenge_literAlura.main;

import br.com.alura.challenge_literAlura.model.Book;
import br.com.alura.challenge_literAlura.model.dto.AuthorDTO;
import br.com.alura.challenge_literAlura.model.dto.BookDTO;
import br.com.alura.challenge_literAlura.service.AuthorService;
import br.com.alura.challenge_literAlura.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {

    private final BookService bookService;
    private final AuthorService authorService;
    private final Scanner scanner = new Scanner(System.in);

    public Main(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public void run(String... args) throws Exception {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        buscarLivroPeloTitulo();
                        break;
                    case 2:
                        listarLivrosRegistrados();
                        break;
                    case 3:
                        listarAutoresRegistrados();
                        break;
                    case 4:
                        listarAutoresVivosEmAno();
                        break;
                    case 5:
                        listarLivrosPorIdioma();
                        break;
                    case 0:
                        System.out.println("Encerrando a aplicação! Até mais.");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.nextLine();
                opcao = -1;
            }
        }
    }

    private void exibirMenu() {
        String menu = """
                
                *** Escolha um número de sua opção ***
                1- Buscar livros pelo título
                2- Listar livros registrados
                3- Listar autores registrados
                4- Listar autores vivos em um determinado ano
                5- Listar livros de um determinado idioma
                
                0 - Sair
                """;
        System.out.println(menu);
    }

    private void buscarLivroPeloTitulo() {
        System.out.println("Digite o titulo do livro que deseja buscar: ");
        String titulo = scanner.nextLine();
        Book livroEncontrado = bookService.searchAndSaveBookByTitle(titulo);
        if (livroEncontrado != null) {
            System.out.println("\n--- Livro Encontrado ---");
            System.out.println(livroEncontrado);
            System.out.println("------------------------\n");
        }
    }

    private void listarLivrosRegistrados() {
        List<BookDTO> livros = bookService.listAllBooks();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro registrado no banco de dados.");
        } else {
            System.out.println("\n--- Livros Registrados ---");
            livros.forEach(System.out::println);
            System.out.println("--------------------------\n");
        }
    }

    private void listarAutoresRegistrados() {
        List<AuthorDTO> autores = authorService.listAllAuthors();
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor registrado no banco de dados.");
        } else {
            System.out.println("\n--- Autores Registrados ---");
            autores.forEach(System.out::println);
            System.out.println("---------------------------\n");
        }
    }

    private void listarAutoresVivosEmAno() {
        System.out.println("Digite o ano para buscar autores vivos: ");
        try {
            int ano = scanner.nextInt();
            scanner.nextLine();
            List<AuthorDTO> autores = authorService.listAuthorsAliveInYear(ano);
            if (autores.isEmpty()) {
                System.out.println("Nenhum autor vivo encontrado para o ano de " + ano + ".");
            } else {
                System.out.println("\n--- Autores Vivos em " + ano + " ---");
                autores.forEach(System.out::println);
                System.out.println("--------------------------------\n");
            }
        } catch (InputMismatchException e) {
            System.err.println("Ano inválido. Por favor, digite um número.");
            scanner.nextLine();
        }
    }

    private void listarLivrosPorIdioma() {
        System.out.println("Digite o código do idioma para busca (ex: en, pt, es, fr):");
        String idioma = scanner.nextLine();
        List<BookDTO> livros = bookService.listBooksByLanguage(idioma);
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o idioma '" + idioma + "'.");
        } else {
            System.out.println("\n--- Livros no Idioma '" + idioma + "' ---");
            livros.forEach(System.out::println);
            System.out.println("----------------------------------\n");
        }
    }
}
