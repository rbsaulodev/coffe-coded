package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateInstance1 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateInstance2 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateInstance3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Italia: " + dateInstance.format(calendar.getTime()));
        System.out.println("Suiça: " + dateInstance1.format(calendar.getTime()));
        System.out.println("India: " + dateInstance2.format(calendar.getTime()));
        System.out.println("Japão: " + dateInstance3.format(calendar.getTime()));

        System.out.println(" ");

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());

        System.out.println(" ");

        System.out.println(localeItaly.getDisplayLanguage());
        System.out.println(localeIndia.getDisplayLanguage());
        System.out.println(localeCH.getDisplayLanguage());
        System.out.println(localeJapao.getDisplayLanguage());
    }
}
