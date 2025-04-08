package academy.devdojo.maratonajava.javacore.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; // String constant pool
        String nome2 = "Willian";

        nome = nome.concat(" Suane");
        System.out.println(nome == nome2);
        System.out.println(nome);

        System.out.println(" ");

        String nome3 = new String("Willian");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
