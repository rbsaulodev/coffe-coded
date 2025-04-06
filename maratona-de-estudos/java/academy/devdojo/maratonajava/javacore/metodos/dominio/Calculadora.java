package academy.devdojo.maratonajava.javacore.metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtracaoDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicacaoDeDoisNumeros(double x, double y) {
        System.out.println(x * y);
    }

    public double divisaoDeDoisNumeros(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(x / y);
    }

    public void alteraDoisNumeros(int x, int y) {
        x = 99;
        y = 33;
        System.out.println(x + " " + y);
    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println("Resultado: "+soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println("Resultado: "+soma);
    }
}
