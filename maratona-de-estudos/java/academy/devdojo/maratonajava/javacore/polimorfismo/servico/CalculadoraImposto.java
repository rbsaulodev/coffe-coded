package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Informações do Produto: \n" + "Nome: " + produto.getNome() + "\nPreço: R$ " + produto.getValor());
        System.out.println("Impsoto sobre o produto: " + produto.calcularImposto());
        switch (produto) {
            case Tomate tomate -> System.out.println("Data de validade: " + tomate.getDatadeValidade());
            case Computador computador -> System.out.println("Placa de Vídeo: " + computador.getPlacaDeVideo());
            case Televisao tv -> System.out.println("Smart: " + tv.getSmart());
            default -> System.out.println("Produto Invalido");
        }
        System.out.println(" ");
    }
}
