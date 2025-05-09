import br.com.alura.desafio.model.Endereco;
import br.com.alura.desafio.service.ViaCepService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CEP para consultar: ");
        String cep = scanner.nextLine();

        ViaCepService service = new ViaCepService();
        Endereco endereco = service.buscarEndereco(cep);

        System.out.println("\n== Endereço Encontrado ==");
        System.out.println(endereco);
    }
}
