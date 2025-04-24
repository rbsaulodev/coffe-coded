package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //Meta caracteres
        // "\d" -> retorna todas os digitos
        // "\D" -> retorna tudo que não for digito
        // "\s" -> retorna valores em branco/espaço \t \n \f \r
        // "\S" -> retorna valores que não estão em branco
        // "/w" -> a-ZA-Z, digitos e _

        System.out.println("\\d :");

        String regex = "\\d";
        String texto = "1@2 b3_";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find())
            System.out.println("Texto: " + regex + "\nIndice: " + matcher.start()+"\n" + "Valor: " + matcher.group() + "\n");

        System.out.println("\\D :");

        String regex1 = "\\D";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(texto);
        while (matcher1.find())
            System.out.println("Texto: " + regex1 + "\nIndice: " + matcher1.start()+"\n" + "Valor: " + matcher1.group() + "\n");

        System.out.println("\\s :");

        String regex2 = "\\s";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto);
        while (matcher2.find())
            System.out.println("Texto: " + regex2 + "\nIndice: " + matcher2.start()+"\n" + "Valor: " + matcher2.group() + "\n");

        System.out.println("\\S :");

        String regex3 = "\\S";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(texto);
        while (matcher3.find())
            System.out.println("Texto: " + regex3 + "\nIndice: " + matcher3.start()+"\n" + "Valor: " + matcher3.group() + "\n");

        System.out.println("\\w :");

        String regex4 = "\\w";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(texto);
        while (matcher4.find())
            System.out.println("Texto: " + regex4 + "\nIndice: " + matcher4.start()+"\n" + "Valor: " + matcher4.group() + "\n");
    }
}
