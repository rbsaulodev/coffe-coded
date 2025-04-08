package academy.devdojo.maratonajava.classesutilitarias.date.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date data = new Date(1744060990556L);
        data.setTime(data.getTime() + 3_600_000);
        System.out.println(data);
    }
}
