import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        boolean isPlanoPlus = true;
        int anoDeLancamento = 2022;
        double mediaDoFilme = (9.8 + 6.3 + 8.0) / 3;
        DecimalFormat df = new DecimalFormat("0.##");

        String nomeDoFilme = "Top Gun: Maverick";

        if (isPlanoPlus == true) {
            System.out.println("Filme: " + nomeDoFilme);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
            System.out.println("Nota: " + df.format(mediaDoFilme));
        }
    }
}