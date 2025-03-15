public class Aula05EstruturasCondicionais07 {
    // Dados os valores de 1 a 7 imprima se é dia útil ou final de semana considerando 1 como domingo
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1,7 -> System.out.println("Final de Semana!");
            case 2,3,4,5,6 -> System.err.println("Dia Util!");
            default -> System.out.println("Opção Invalida!");
        }
    }

}
