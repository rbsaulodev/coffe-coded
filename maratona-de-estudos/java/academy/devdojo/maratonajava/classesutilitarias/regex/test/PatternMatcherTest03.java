package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Range
        // [] -> vai procurar pelas as letras dentro do "[]"

        // Para retornar os caracteres de "a" até "z" podemos usar a-z, se for de "A" até "C" pode usar A-C
        String texto = "12 0x 0xFF 0xG 0xff";
        String regex = "0[xX][0-9a-fA-F]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find())
            System.out.println("Texto: " + regex + "\nIndice: " + matcher.start()+"\n" + "Valor: " + matcher.group() + "\n");

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);

    }
}
