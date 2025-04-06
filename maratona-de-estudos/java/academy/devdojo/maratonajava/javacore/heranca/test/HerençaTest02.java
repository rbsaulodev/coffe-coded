package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;

public class HerençaTest02 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Alagoas");
        endereco.setCep("7878923");
        Funcionario funcionario = new Funcionario("Saulo");
        funcionario.setCpf("8976788023");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1800);
        funcionario.imprime();
    }
}
