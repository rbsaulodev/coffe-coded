package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest04 {
    public static void main(String[] args) {
        //Exception genéricas sempre vão ser as ultimas
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException ");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}

