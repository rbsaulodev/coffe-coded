package br.com.alura.desafio.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private LocalDate dataDeNascimento;
    private String email;
    private ArrayList<Audio> favoritos = new ArrayList<>();
    private ArrayList<Playlist> playlists = new ArrayList<>();

    // Construtor completo original
    public Usuario(String nome, LocalDate dataDeNascimento, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
    }

    // Novo construtor simplificado
    public Usuario(String nome) {
        this.nome = nome;
        this.dataDeNascimento = null; // Inicialmente nulo, deve ser setado posteriormente
        this.email = ""; // Valor padrão vazio
    }

    // Construtor com nome e data de nascimento
    public Usuario(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = ""; // Valor padrão vazio
    }

    public boolean existePlaylistComNome(String nome) {
        return playlists.stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(nome));
    }

    // Novo método para buscar uma playlist pelo nome
    public Playlist buscarPlaylistPorNome(String nome) {
        return playlists.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public void adicionaPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        this.playlists.remove(playlist);
    }

    public ArrayList<Audio> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Audio> favoritos) {
        this.favoritos = favoritos;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
