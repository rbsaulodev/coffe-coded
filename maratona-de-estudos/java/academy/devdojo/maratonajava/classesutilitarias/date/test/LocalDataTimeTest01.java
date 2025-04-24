package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDataTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2025, 4, 9);
        LocalTime time = LocalTime.of(8, 40,00);
        System.out.println(ldt);
        LocalDateTime ltd2 = date.atTime(time);
        System.out.println(ltd2);
    }

}
