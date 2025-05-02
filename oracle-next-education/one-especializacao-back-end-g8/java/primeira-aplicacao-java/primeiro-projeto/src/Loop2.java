import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int media = 0;
        int i = 0;
        int nota = 0;
        int soma = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota para a série The FBIs: ");
            nota = scanner.nextInt();
            if (nota != -1) {
                soma += nota;
                i++;
            }
        }
        media = soma / i;
        System.out.println("A média da série é " + media);
    }
}
