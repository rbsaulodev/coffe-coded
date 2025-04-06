package academy.devdojo.maratonajava.javacore.exception.exception.test;

public class ExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando recurso...");
        }
    }
}
