package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        // Um site bom para entender e praticar:
        // https://regexr.com

        String texto = "saulo@gmail.com, tali@email.com.br, taioba@sla.com, invalido@email, jose@teste.gov.br";
        String regex = "([a-zA-Z0-9._-]+)@([a-zA-Z]+)(\\.[a-zA-Z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Texto: " + matcher.group());
            System.out.println("Índice: " + matcher.start());
            System.out.println();
        }
    }
}
