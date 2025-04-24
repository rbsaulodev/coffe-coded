package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(10).plusWeeks(7).plusWeeks(2);
        Period between = Period.between(now, nowAfterTwoYears);
        Period period = Period.ofDays(10);
        System.out.println(period);
        System.out.println(between);
    }
}
