package br.com.alura.desafio.interfaces;

import br.com.alura.desafio.model.Audio;
import br.com.alura.desafio.model.Playlist;
import br.com.alura.desafio.model.Usuario;

public interface Reproduzivel {
    void reproduzirAudio(Audio audio);
    void paraAudio(Audio audio);
}
