package academy.devdojo.maratonajava.classesutilitarias.io.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("academy/devdojo/maratonajava/arquivo/fwTest.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Escrevendo uma linha no arquivo.");
            bw.newLine();
            bw.write("Segunda linha com sucesso!");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
