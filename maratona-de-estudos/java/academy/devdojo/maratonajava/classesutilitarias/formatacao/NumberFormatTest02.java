package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        Locale localeCN = Locale.CANADA;

        NumberFormat[] format = new NumberFormat[4];
        format[0] = NumberFormat.getCurrencyInstance(localeBR);
        format[1] = NumberFormat.getCurrencyInstance(localeJP);
        format[2] = NumberFormat.getCurrencyInstance(localeIT);
        format[3] = NumberFormat.getCurrencyInstance(localeCN);

        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : format) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valorString = "$100000000";

        try {
            Number parse = format[3].parse(valorString);
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
