package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Quantificadores
        // ? 0 - 1
        // * 0 - ou mais
        // + 1 - ou mais
        // {n, m} n - m
        // ()
        // | -> o(v|c)o => ovo OU oco
        // . ele
        String texto = "12 0xF23 0xFF 0xG 0xffg";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find())
            System.out.println("Texto: " + regex + "\nIndice: " + matcher.start()+"\n" + "Valor: " + matcher.group() + "\n");

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);

    }
}
