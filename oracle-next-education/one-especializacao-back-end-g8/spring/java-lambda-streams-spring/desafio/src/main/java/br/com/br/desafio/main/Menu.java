package br.com.br.desafio.main;

import br.com.br.desafio.model.AutomovelData;
import br.com.br.desafio.serivces.ApiService;
import br.com.br.desafio.serivces.ConverteDados;

import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ApiService apiService;
    private final String BASE_URL = "https://fipe.parallelum.com.br/api/v2/";
    private String urlCompleta;
    private ConverteDados converteDados;

    public Menu() {
        this.apiService = new ApiService();
        this.converteDados = new ConverteDados();
    }

    public void menu() {
        var opcoes =
                "********************************************\n"+
                        "Deseja qual automovel deseja ver as marcas: \n" +
                        "                 -Carros-                   \n" +
                        "                 -Motos-                    \n" +
                        "                 -Caminhões-                \n" +
                        "********************************************\n";
        System.out.println(opcoes);
        String automovelEscolhido = scanner.nextLine();

        if (automovelEscolhido.equalsIgnoreCase("Carros")) {
            urlCompleta = BASE_URL + "cars/brands";
        } else if (automovelEscolhido.equalsIgnoreCase("Motos")) {
            urlCompleta = BASE_URL + "motorcycles/brands";
        } else if (automovelEscolhido.equalsIgnoreCase("Caminhões")) {
            urlCompleta = BASE_URL + "trucks/brands";
        } else {
            urlCompleta = BASE_URL + "cars/brands";
        }

        var json = apiService.getData(urlCompleta);
        var marcas = converteDados.getList(json, AutomovelData.class);
        marcas.stream()
                .sorted(Comparator.comparing(AutomovelData::code))
                .forEach(System.out::println);

        System.out.println("Deseja ver qual modelos de carros de acordo com o ID das marcas: ");
        int idMarca = scanner.nextInt();
        scanner.nextLine();

        urlCompleta = urlCompleta + "/" + idMarca + "/models";

        json = apiService.getData(urlCompleta);
        var modelos = converteDados.getList(json, AutomovelData.class);

        System.out.println("Modelos da marca: ");
        if (modelos != null && !modelos.isEmpty()) {
            modelos.stream()
                    .sorted(Comparator.comparing(AutomovelData::code))
                    .forEach(System.out::println);
        } else {
            System.out.println("Nenhum modelo encontrado para esta marca.");
        }
    }
}