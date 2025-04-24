package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        Locale localeCN = Locale.CANADA;

        NumberFormat[] format = new NumberFormat[4];
        format[0] = NumberFormat.getInstance(localeBR);
        format[1] = NumberFormat.getInstance(localeJP);
        format[2] = NumberFormat.getInstance(localeIT);
        format[3] = NumberFormat.getInstance(localeCN);

        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : format) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String valorString = "100000000";

        try {
            Number parse = format[0].parse(valorString);
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
