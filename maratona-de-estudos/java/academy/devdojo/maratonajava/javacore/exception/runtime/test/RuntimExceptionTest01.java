package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RuntimExceptionTest01 {
    public static void main(String[] args) {
        //Checked Unchecked
        //Checked -> são exceções são filhas da classe excpetion e se elas não tratadas vai ter um erro na compilação no código
        //Uncheckded -> são exceções filhas da runtime excpetion, geralmente são erros do programador

        Object object = null;
        System.out.println(object.toString());

        int[] num = {1, 2};
        System.out.println(num[2]);
    }
}
