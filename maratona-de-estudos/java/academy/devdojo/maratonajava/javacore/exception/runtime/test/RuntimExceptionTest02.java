package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RuntimExceptionTest02 {
    public static void main(String[] args) {
        float divisao = divisao(1, 2);
        System.out.println(divisao);
    }

    private static float divisao(float a, float b){
        if (b == 0)
            throw new IllegalArgumentException("Argumento ilegal - Não é possivel realizar divisão por 0");
        return a/b;
    }
}
