import br.com.alura.desafio.DTO.MoedaDTO;
import br.com.alura.desafio.model.Moeda;
import br.com.alura.desafio.service.MoedaService;
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoedaService service = new MoedaService();
        Gson gson = new Gson();

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("******************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println(" ");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println(" ");
            System.out.println("Escolha uma opção válida:");
            System.out.println("******************************");

            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            String base = "";
            String alvo = "";

            switch (opcao) {
                case 1 -> { base = "USD"; alvo = "ARS"; }
                case 2 -> { base = "ARS"; alvo = "USD"; }
                case 3 -> { base = "USD"; alvo = "BRL"; }
                case 4 -> { base = "BRL"; alvo = "USD"; }
                case 5 -> { base = "USD"; alvo = "COP"; }
                case 6 -> { base = "COP"; alvo = "USD"; }
                case 7 -> {
                    System.out.println("Saindo...");
                    break;
                }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            if (opcao >= 1 && opcao <= 6) {
                try {
                    String json = service.buscaMoeda(base); // Você vai implementar isso
                    MoedaDTO dto = gson.fromJson(json, MoedaDTO.class);
                    Moeda moeda = new Moeda(dto);

                    System.out.println("Digite o valor que deseja converter:");
                    double valor = scanner.nextDouble();
                    double taxa = moeda.getConversaoPara(alvo);
                    double convertido = valor * taxa;

                    System.out.printf("Valor convertido: %.2f %s = %.2f %s%n", valor, base, convertido, alvo);
                } catch (Exception e) {
                    System.out.println("Erro ao consultar API: " + e.getMessage());
                }
            }
        }
        scanner.close();
    }
}
