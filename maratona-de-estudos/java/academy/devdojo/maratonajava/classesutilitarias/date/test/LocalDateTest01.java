package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.APRIL, 9);
        LocalDate dateAgora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(dateAgora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
