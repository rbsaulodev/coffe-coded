import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota para a méida da série 'The FBIs' ");
            int nota = scanner.nextInt();
            soma += nota;
        }
        int media = soma / 3;
        System.out.println("A méida da série The FBIs é: " + media);
    }
}
