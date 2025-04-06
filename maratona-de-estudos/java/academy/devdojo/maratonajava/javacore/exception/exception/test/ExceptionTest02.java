package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("java/academy/devdojo/maratonajava/arquivo\\text.txt");
        try {
            boolean isNewFile = file.createNewFile();
            System.out.println("Crinado arquivo: " + isNewFile);
        }catch (IOException e){
            e.printStackTrace();
            throw new RemoteException("Problema na hora da criação do Arquivo");
        }
    }
}
