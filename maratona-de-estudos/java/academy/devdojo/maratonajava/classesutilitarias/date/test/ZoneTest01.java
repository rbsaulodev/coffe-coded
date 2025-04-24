package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(" ");

        System.out.println(ZoneId.systemDefault());
        ZoneId asia = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(" ");
        System.out.println(asia);
        ZonedDateTime zonedDateTime = now.atZone(asia);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(asia);
        System.out.println(zonedDateTime1);
    }
}
