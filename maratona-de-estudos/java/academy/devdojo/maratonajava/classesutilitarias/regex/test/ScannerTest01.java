package academy.devdojo.maratonajava.classesutilitarias.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String name = "Taliene, Taioba, Bobona, Brincalhona";
        String[] names = name.split(",");
        for (String s : names) {
            System.out.println(s.trim());
        }
    }
}
