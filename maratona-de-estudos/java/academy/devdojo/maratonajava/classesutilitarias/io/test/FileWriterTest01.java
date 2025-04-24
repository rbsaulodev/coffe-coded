package academy.devdojo.maratonajava.classesutilitarias.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("academy/devdojo/maratonajava/arquivo/fwTest.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Tali é a mais bobona e taioba da vida\nPangaré\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}