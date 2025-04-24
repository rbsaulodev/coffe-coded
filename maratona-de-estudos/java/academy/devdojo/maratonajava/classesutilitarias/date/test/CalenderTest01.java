package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da Semana!");
        }

        c.add(Calendar.DAY_OF_MONTH,  4);
        c.roll(Calendar.HOUR, 10);

        Date date = c.getTime();
        System.out.println(date);
    }
}
