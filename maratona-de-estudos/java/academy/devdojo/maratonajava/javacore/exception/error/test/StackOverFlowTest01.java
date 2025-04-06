package academy.devdojo.maratonajava.javacore.exception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        System.out.println("contador");
        recursividade();
    }
}
