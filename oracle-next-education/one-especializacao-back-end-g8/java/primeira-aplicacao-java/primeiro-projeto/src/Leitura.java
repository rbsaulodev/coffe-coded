import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sua série favorita: ");
        String nomeDaSerie = scanner.nextLine();

        System.out.println("Digite o ano da sua série: ");
        int anoDaSeire = scanner.nextInt();

        System.out.println("Dê a sua nota para a série: ");
        double nota = scanner.nextDouble();

        System.out.println("Nome: " + nomeDaSerie);
        System.out.println("Ano: " + anoDaSeire);
        System.out.println("Nota: " + nota);
    }
}
