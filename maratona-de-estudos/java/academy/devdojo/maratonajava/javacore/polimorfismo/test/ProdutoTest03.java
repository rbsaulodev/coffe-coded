package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador produto = new Computador("Dell G15", 5000);
        Tomate produto1 = new Tomate("Americano", 20);
        Televisao produto2 = new Televisao("Samsung 50\"",  3000);

        produto.setPlacaDeVideo("RTX 3090");
        produto1.setDatadeValidade("04/04/2025");
        produto2.setSmart(true);

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(produto1);
        CalculadoraImposto.calcularImposto(produto2);
    }
}
