package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        //Duration não aceita LocalDate!!
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        Duration btw = Duration.between(now, nowAfterTwoYears);
        System.out.println(btw);
    }
}
