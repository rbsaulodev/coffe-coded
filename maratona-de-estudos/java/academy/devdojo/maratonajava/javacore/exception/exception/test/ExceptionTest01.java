package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("java/academy/devdojo/maratonajava/arquivo\\text.txt");
        try {
            boolean isNewFile = file.createNewFile();
            System.out.println("Crinado arquivo: " + isNewFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
