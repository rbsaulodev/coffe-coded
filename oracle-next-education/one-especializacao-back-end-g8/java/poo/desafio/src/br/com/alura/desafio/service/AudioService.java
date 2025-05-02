package br.com.alura.desafio.service;

import br.com.alura.desafio.interfaces.Favoritavel;
import br.com.alura.desafio.interfaces.GerenciadorDePlaylist;
import br.com.alura.desafio.interfaces.Reproduzivel;
import br.com.alura.desafio.model.Audio;
import br.com.alura.desafio.model.Playlist;
import br.com.alura.desafio.model.Usuario;

import java.util.ArrayList;

public class AudioService implements Favoritavel, GerenciadorDePlaylist, Reproduzivel {

    @Override
    public void criaPlaylistVazia(Usuario usuario, String nome) {
        if (usuario.existePlaylistComNome(nome)) {
            mensagemJaExistePlaylist(nome);
            return;
        }
        usuario.adicionaPlaylist(new Playlist(usuario, nome));
        System.out.println("Playlist criada com sucesso!");
    }

    @Override
    public void criaPlaylistComUmaMusica(Usuario usuario, String nome, Audio audio) {
        if (usuario.existePlaylistComNome(nome)) {
            mensagemJaExistePlaylist(nome);
            return;
        }
        usuario.adicionaPlaylist(new Playlist(usuario, nome, audio));
        System.out.println("Playlist criada com sucesso!");
    }

    @Override
    public void criaPlaylistComVariasMusicas(Usuario usuario, String nome, ArrayList<Audio> audios) {
        if (usuario.existePlaylistComNome(nome)) {
            mensagemJaExistePlaylist(nome);
            return;
        }
        usuario.adicionaPlaylist(new Playlist(usuario, nome, audios));
        System.out.println("Playlist criada com sucesso!");
    }

    @Override
    public void deletaPlaylistDoUsuario(Usuario usuario, Playlist playlist) {
        if (!usuario.existePlaylistComNome(playlist.getNome())) {
            System.out.println("Não existe uma playlist com esse nome.");
            return;
        }
        usuario.removePlaylist(playlist);
        System.out.println("Playlist removida com sucesso!");
    }

    @Override
    public void adicionarMusicaNaPlaylist(Playlist playlist, Audio audio) {
        if (playlist.getPlaylist().contains(audio)) {
            System.out.println(audio.getTipo() + " já está na Playlist: " + playlist.getNome());
            return;
        }
        playlist.adicionaMusicaNaPlaylist(playlist, audio);
        System.out.println(audio.getTipo() + " adicionado na Playlist: " + playlist.getNome());
    }

    @Override
    public void removerMusicaDaPlaylist(Playlist playlist, Audio audio) {
        if (!playlist.getPlaylist().contains(audio)) {
            System.out.println(audio.getTipo() + " não está na Playlist: " + playlist.getNome());
            return;
        }
        playlist.removeMusicaDaPlaylist(playlist, audio);
        System.out.println(audio.getTipo() + " removido da Playlist: " + playlist.getNome());
    }

    @Override
    public void favoritaAudio(Usuario usuario, Audio audio) {
        if (usuario.getFavoritos().contains(audio)) {
            System.out.println(audio.getTipo() + " já está nos favoritos.");
            return;
        }
        usuario.getFavoritos().add(audio);
        System.out.println(audio.getTipo() + " adicionado aos favoritos.");
    }

    @Override
    public void removeFavorito(Usuario usuario, Audio audio) {
        if (!usuario.getFavoritos().contains(audio)) {
            System.out.println(audio.getTipo() + " não está nos favoritos.");
            return;
        }
        usuario.getFavoritos().remove(audio);
        System.out.println(audio.getTipo() + " removido dos favoritos.");
    }

    @Override
    public void reproduzirAudio(Audio audio) {
        if (audio.isReproduzindo()) {
            System.out.println(audio.getTipo() + " já está sendo reproduzido.");
            return;
        }
        audio.setReproduzindo(true);
        System.out.println("Reproduzindo " + audio.getTipo() + ": " + audio.getTitulo());
    }

    @Override
    public void paraAudio(Audio audio) {
        if (!audio.isReproduzindo()) {
            System.out.println(audio.getTipo() + " já está parado.");
            return;
        }
        audio.setReproduzindo(false);
        System.out.println("Parando " + audio.getTipo() + ": " + audio.getTitulo());
    }

    // Métodos auxiliares privados
    private void mensagemJaExistePlaylist(String nome) {
        System.out.println("Já existe uma playlist com o nome: " + nome);
    }
}
