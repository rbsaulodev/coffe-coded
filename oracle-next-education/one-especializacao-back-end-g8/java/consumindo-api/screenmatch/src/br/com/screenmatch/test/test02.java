package br.com.screenmatch.test;

import br.com.screenmatch.DTO.FilmeDTO;
import br.com.screenmatch.model.Filme;
import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual filme você quer pesquisar: ");
        var filmeInput = scanner.nextLine();

        String filmeFormatado = URLEncoder.encode(filmeInput, StandardCharsets.UTF_8);
        String endereco = "http://www.omdbapi.com/?t=" + filmeFormatado + "&apikey=2096213c";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println("JSON recebido:\n" + json);

        Gson gson = new Gson();
        FilmeDTO dto = gson.fromJson(json, FilmeDTO.class);

        Filme filme = new Filme(dto);
        System.out.println("\n--- Dados do Filme ---");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Ano: " + filme.getAno());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Atores: " + filme.getAtores());
        System.out.println("Sinopse: " + filme.getSinopse());
        System.out.println("Idioma: " + filme.getIdioma());
        System.out.println("País: " + filme.getPais());
        System.out.println("Prêmios: " + filme.getPremios());
        System.out.println("Nota IMDb: " + filme.getImdbNota());
        System.out.println("Poster: " + filme.getPosterUrl());
    }
}
