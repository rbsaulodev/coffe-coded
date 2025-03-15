package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    // Tipos primitivos são tipos que vão guardar em memória um valor simples
    // int, double, float, char, byte, long, short, boolean

    public static void main(String[] args) {
        int age = 10;
        long number = 10000L;
        double salary = 5800.50;
        float salaryFloat = 5800.75F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean veritable = true;
        boolean untrue = false;
        char gender = 'M';

        System.out.println("Idade (int): " + age);
        System.out.println("Número (long): " + number);
        System.out.println("Salário (double): " + salary);
        System.out.println("Salário (float): " + salaryFloat);
        System.out.println("Idade em byte: " + ageByte);
        System.out.println("Idade em short: " + ageShort);
        System.out.println("Valor booleano verdadeiro: " + veritable);
        System.out.println("Valor booleano falso: " + untrue);
        System.out.println("Gênero (char): " + gender);

        //String (Obs.: String não é um tipo primitivo)
        String name = "Saulo";
        System.out.println("Nome: "+name);
    }
}
