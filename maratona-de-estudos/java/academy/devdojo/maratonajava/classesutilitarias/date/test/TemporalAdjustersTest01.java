package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        now = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
    }
}
