package academy.devdojo.maratonajava.classesutilitarias.io.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("academy/devdojo/maratonajava/arquivo/fwTest.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file));){
            String s;
            while((s = br.readLine()) != null)
                System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
