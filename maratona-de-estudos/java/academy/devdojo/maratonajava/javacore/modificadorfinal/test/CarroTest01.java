package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Miata");
        carro.COMPRADOR.setNome("Saulo");
        System.out.println(carro.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(" ");
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");
        ferrari.imprime();
        ferrari.COMPRADOR.setNome("Saulo");
    }
}
