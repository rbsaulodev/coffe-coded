package br.com.alura.desafio.interfaces;

import br.com.alura.desafio.model.Audio;
import br.com.alura.desafio.model.Usuario;

public interface Favoritavel {
    void favoritaAudio(Usuario usuario, Audio audio);
    void removeFavorito(Usuario usuario, Audio audio);
}
