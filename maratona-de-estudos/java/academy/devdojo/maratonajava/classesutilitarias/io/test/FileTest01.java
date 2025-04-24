package academy.devdojo.maratonajava.classesutilitarias.io.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("academy/devdojo/maratonajava/arquivo/file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
//            if (file.exists()) {
//                boolean delete = file.delete();
//                System.out.println(delete);
//            }
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println("Arquivo: " + file.isFile());
            System.out.println(new Date(file.lastModified()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
