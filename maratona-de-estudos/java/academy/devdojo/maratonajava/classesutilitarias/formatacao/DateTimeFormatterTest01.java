package academy.devdojo.maratonajava.classesutilitarias.formatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        LocalDate parse = LocalDate.parse("20250410",DateTimeFormatter.BASIC_ISO_DATE );

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter brasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(brasil));
    }
}
