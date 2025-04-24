package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.of(8, 20);
        System.out.println(time + ", " + time2);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
