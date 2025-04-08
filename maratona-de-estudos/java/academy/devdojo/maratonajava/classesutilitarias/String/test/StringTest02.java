package academy.devdojo.maratonajava.javacore.String.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "      Ichigo Kurosaki    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("i", "a"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(" ");

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 4));
        System.out.println(nome.trim());

    }
}
