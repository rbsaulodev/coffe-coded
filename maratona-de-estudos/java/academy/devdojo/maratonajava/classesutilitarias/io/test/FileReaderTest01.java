package academy.devdojo.maratonajava.classesutilitarias.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("academy/devdojo/maratonajava/arquivo/fwTest.txt");

        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
