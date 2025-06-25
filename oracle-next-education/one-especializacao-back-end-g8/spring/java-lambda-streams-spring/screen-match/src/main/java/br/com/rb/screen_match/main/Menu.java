package br.com.rb.screen_match.main;

import br.com.rb.screen_match.model.Episodes;
import br.com.rb.screen_match.model.Seasons;
import br.com.rb.screen_match.model.Series;
import br.com.rb.screen_match.services.ApiService;
import br.com.rb.screen_match.services.ConverteData;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ApiService apiService = new ApiService();
    private final ConverteData converteData = new ConverteData();
    private final String URL_BASE = "https://www.omdbapi.com/";
    private final String API_KEY = "a58e2253";

    public void menu() {
        System.out.print("Digite o nome da série para a busca: ");
        String pesquisa = scanner.nextLine();
        String pesquisaCodificada = encode(pesquisa);

        Series serieEscolhida = getSerie(pesquisaCodificada);
        System.out.println("\nInformações da série:");
        System.out.println(serieEscolhida);

        List<Seasons> temporadas = getTemporadas(pesquisaCodificada, serieEscolhida.totalTemporadas());

        System.out.printf("\nTotal de Temporadas: %d\n\n", serieEscolhida.totalTemporadas());
        getEpisodios(pesquisaCodificada, serieEscolhida.totalTemporadas());
    }

    private String encode(String texto) {
        return URLEncoder.encode(texto, StandardCharsets.UTF_8);
    }

    private String montarUrl(String titulo, Integer temporada) {
        StringBuilder url = new StringBuilder(URL_BASE)
                .append("?t=").append(titulo)
                .append("&apikey=").append(API_KEY);

        if (temporada != null) {
            url.append("&season=").append(temporada);
        }

        return url.toString();
    }

    private Series getSerie(String tituloCodificado) {
        String url = montarUrl(tituloCodificado, null);
        String json = apiService.getData(url);
        return converteData.getData(json, Series.class);
    }

    private List<Seasons> getTemporadas(String tituloCodificado, int totalTemporadas) {
        List<Seasons> temporadas = new ArrayList<>();
        for (int i = 1; i <= totalTemporadas; i++) {
            String url = montarUrl(tituloCodificado, i);
            String json = apiService.getData(url);
            Seasons temporada = converteData.getData(json, Seasons.class);
            temporadas.add(temporada);
        }
        return temporadas;
    }

    private void getEpisodios(String tituloCodificado, int totalTemporadas) {
        for (int i = 1; i <= totalTemporadas; i++) {
            String url = montarUrl(tituloCodificado, i);
            String json = apiService.getData(url);
            Seasons temporada = converteData.getData(json, Seasons.class);

            System.out.println("Temporada " + temporada.numero() + ":");

            temporada.episodes().forEach(ep ->
                    System.out.printf("  Episódio %02d: %s | Avaliação: %s | Data: %s%n",
                            ep.numero(),
                            ep.titulo(),
                            ep.avaliacao(),
                            ep.dataDeLancamento())
            );
            System.out.println();
        }
    }
}
