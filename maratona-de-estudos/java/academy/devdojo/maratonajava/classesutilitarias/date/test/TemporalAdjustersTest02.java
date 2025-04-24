package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUlti implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        System.out.println(dayOfWeek);
        int addDays;
        switch (dayOfWeek){
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAdjustersTest02{
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate with = data.with(new ObterProximoDiaUlti());
        System.out.println(with);
    }
}
