package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.sql.SQLOutput;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String country : isoCountries) {
            System.out.print(country + " ");
        }

        System.out.println(" ");

        for (String languages : isoLanguages) {
            System.out.print(languages + " ");
        }
    }
}
