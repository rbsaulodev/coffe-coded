package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int x = 1;
        int y = 2;

        System.out.println("Metodo: ");
        calculadora.alteraDoisNumeros(x, y);

        System.out.println("");

        System.out.println("Classe");
        System.out.println(x + " " + y);
    }
}
