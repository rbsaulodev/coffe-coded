package academy.devdojo.maratonajava.javacore.classesabstratas.test;

import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente nami = new Gerente("Nami", 25000);
        Desenvolvedor spike = new Desenvolvedor("Spike", 12000);
        System.out.println(nami);
        System.out.println(spike);
    }
}
