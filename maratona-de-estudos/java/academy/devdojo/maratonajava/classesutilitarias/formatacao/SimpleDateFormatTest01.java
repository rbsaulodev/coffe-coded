package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);

        try {
            System.out.println(simpleDateFormat.parse("Brasil 09 de abril de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
