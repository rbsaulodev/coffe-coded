package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divisaoDeDoisNumeros(20, 2);
        System.out.println(resultado);
        System.out.println(calculadora.divisaoDeDoisNumeros(10, 2));
        calculadora.imprimeDivisaoDeDoisNumeros(10, 5);
    }
}
