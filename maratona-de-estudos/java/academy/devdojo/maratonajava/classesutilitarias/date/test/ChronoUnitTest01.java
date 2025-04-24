package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(2005, 12, 6);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
    }
}
