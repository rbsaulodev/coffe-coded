public class Condicional {
    public static void main(String[] args) {
        boolean isPlanoPlus;
        String tipoPlano = "Plus";
        int anoDeLancamento = 1990;
        double mediaDoFilme = (9.8 + 6.3 + 8.0) / 3;

        if (anoDeLancamento > 2024){
            System.out.println("Lançamento que os clientes tão curtindo");
        } else {
            System.out.println("Filme retro");
        }

        switch (tipoPlano){
            case "Plus":
                System.out.println("Todos os filmes no catalogo");
                isPlanoPlus = true;
            case "Free":
                System.out.println("Poucos filmes no catalogo");
                isPlanoPlus = false;
            case "Gold":
                System.out.println("Quase todos os filmes no catalogo");
                isPlanoPlus = false;
                break;
            default:
                System.out.println("Plano não existente");
        }
    }
}
