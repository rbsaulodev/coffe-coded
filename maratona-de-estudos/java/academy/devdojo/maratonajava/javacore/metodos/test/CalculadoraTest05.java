package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] arrayTest = {2, 5, 8, 1, 10};

        calculadora.somaArray(arrayTest);
        calculadora.somaArray(new int[]{2, 5, 8, 1, 10});

        calculadora.somaVarArgs(arrayTest);
        calculadora.somaVarArgs(2, 5, 6, 8, 1, 10);


    }
}
