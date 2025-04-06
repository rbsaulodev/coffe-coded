package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
