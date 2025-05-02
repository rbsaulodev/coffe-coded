import br.com.alura.desafio.model.*;
import br.com.alura.desafio.service.AudioService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AudioService service = new AudioService();

        // Criação do usuário
        Usuario usuario = new Usuario("Saulo");
        // Definindo a data de nascimento posteriormente
        usuario.setDataDeNascimento(LocalDate.of(1990, 1, 1)); // Exemplo: 1º de janeiro de 1990

        // Criação de músicas e podcasts
        // Modificando para passar todos os 4 argumentos para o construtor Musica
        Musica musica1 = new Musica("Bohemian Rhapsody", 360, "Queen", "Rock");
        Musica musica2 = new Musica("Imagine", 240, "John Lennon", "Pop");
        Podcast podcast1 = new Podcast("NerdCast", 1800, "Jovem Nerd", 1250);
        Podcast podcast2 = new Podcast("Café Debug", 1500, "Desenvolvedores", 42);

        // Criação de playlist vazia
        service.criaPlaylistVazia(usuario, "Rock Classics");

        // Tentativa de recriar a mesma playlist
        service.criaPlaylistVazia(usuario, "Rock Classics");

        // Criação de playlist com uma música
        service.criaPlaylistComUmaMusica(usuario, "Favoritas", musica1);

        // Criação de playlist com várias músicas
        ArrayList<Audio> listaAudios = new ArrayList<>();
        listaAudios.add(musica1);
        listaAudios.add(musica2);
        listaAudios.add(podcast1);
        service.criaPlaylistComVariasMusicas(usuario, "Mix Variado", listaAudios);

        // Recuperar playlists usando o novo método
        Playlist mixVariado = usuario.buscarPlaylistPorNome("Mix Variado");
        Playlist favoritas = usuario.buscarPlaylistPorNome("Favoritas");

        // Adicionar música duplicada
        service.adicionarMusicaNaPlaylist(mixVariado, musica1);

        // Adicionar nova música
        service.adicionarMusicaNaPlaylist(mixVariado, podcast2);

        // Remover música existente
        service.removerMusicaDaPlaylist(mixVariado, musica2);

        // Remover música que não existe
        service.removerMusicaDaPlaylist(mixVariado, musica2);

        // Favoritar áudio
        service.favoritaAudio(usuario, musica1);
        service.favoritaAudio(usuario, podcast1);

        // Favoritar repetidamente
        service.favoritaAudio(usuario, musica1);

        // Desfavoritar áudio
        service.removeFavorito(usuario, musica1);
        service.removeFavorito(usuario, musica1); // já removido

        // Testar reprodução
        service.reproduzirAudio(musica2);
        service.reproduzirAudio(musica2); // já está reproduzindo

        service.paraAudio(musica2);
        service.paraAudio(musica2); // já parada
    }
}