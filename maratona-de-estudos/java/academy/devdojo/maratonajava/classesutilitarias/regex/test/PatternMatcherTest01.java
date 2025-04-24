package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaababab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find())
            System.out.println("Texto: " + regex + "\nIndice: " + matcher.start()+"\n");
    }
}
