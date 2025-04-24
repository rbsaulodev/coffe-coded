package academy.devdojo.maratonajava.classesutilitarias.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String name = "true, 200, saulo";
        Scanner scanner = new Scanner(name);
        scanner.useDelimiter(", ");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(i);
            }
            else if (scanner.hasNextBoolean()){
                boolean trueOrFalse = scanner.nextBoolean();
                System.out.println(trueOrFalse);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
