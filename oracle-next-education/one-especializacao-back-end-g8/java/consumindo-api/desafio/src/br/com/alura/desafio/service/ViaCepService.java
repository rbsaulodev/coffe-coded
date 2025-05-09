package br.com.alura.desafio.service;


import br.com.alura.desafio.model.Endereco;
import br.com.alura.desafio.util.JsonUtil;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public Endereco buscarEndereco(String cep) {
        try {
            String url = BASE_URL + cep + "/json";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return JsonUtil.fromJson(response.body(), Endereco.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar endereço: " + e.getMessage());
        }
    }
}
