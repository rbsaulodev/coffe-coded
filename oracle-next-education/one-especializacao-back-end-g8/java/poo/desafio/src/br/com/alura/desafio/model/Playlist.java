package br.com.alura.desafio.model;

import java.util.ArrayList;

public class Playlist{
    private String nome;
    private ArrayList<Audio> playlist;
    private Usuario usuario;

    public Playlist(Usuario usuario, String nome) {
        this.usuario = usuario;
        this.nome = nome;
        this.playlist = new ArrayList<>(); // Inicializando a lista
    }

    public Playlist(Usuario usuario, String nome, ArrayList<Audio> audios) {
        this.usuario = usuario;
        this.nome = nome;
        this.playlist = audios;
    }

    public Playlist(Usuario usuario, String nome, Audio audio) {
        this.usuario = usuario;
        this.nome = nome;
        this.playlist = new ArrayList<>();
        this.playlist.add(audio);
    }

    public void adicionaMusicaNaPlaylist(Playlist playlist, Audio audio){
        playlist.getPlaylist().add(audio);
    }

    public void removeMusicaDaPlaylist(Playlist playlist, Audio audio){
        playlist.getPlaylist().remove(audio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Audio> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Audio> playlist) {
        this.playlist = playlist;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}