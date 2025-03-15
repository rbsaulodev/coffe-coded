package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Imprima os dias da semana, considerando 1 como domingo 
        int day = 5;

        // Switch só aceita os tipos: char, int, byte, enum e String
        switch (day) {
            case 1 -> System.out.println("Domingo!");
            case 2 -> System.out.println("Segunda!");
            case 3 -> System.out.println("Terca!");
            case 4 -> System.out.println("Quarta!");
            case 5 -> System.out.println("Quinta!");
            case 6 -> System.out.println("Sexta!");
            case 7 -> System.out.println("Sabado!");
            default -> System.out.println("Opção invalida!");
        }

        char sex = 'M';
        switch (sex) {
            case 'M' -> System.out.println("Sexo Masculino!");
            case 'F' -> System.out.println("Sexo Feminino!");
            default -> System.out.println("Opção invalida!");
        }
    }
}
