package br.com.alura.desafio.interfaces;

import br.com.alura.desafio.model.Audio;
import br.com.alura.desafio.model.Playlist;
import br.com.alura.desafio.model.Usuario;

import java.util.ArrayList;

public interface GerenciadorDePlaylist {
    void criaPlaylistVazia(Usuario usuario, String nome);
    void criaPlaylistComUmaMusica(Usuario usuario, String nome, Audio audio);
    void criaPlaylistComVariasMusicas(Usuario usuario, String nome, ArrayList<Audio> audios);
    void deletaPlaylistDoUsuario(Usuario usuario, Playlist playlist);
    void adicionarMusicaNaPlaylist(Playlist playlist, Audio audio);
    void removerMusicaDaPlaylist(Playlist playlist, Audio audio);
}
