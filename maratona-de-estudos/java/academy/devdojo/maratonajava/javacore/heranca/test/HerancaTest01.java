package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;


public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Alagoas");
        endereco.setCep("7878923");
        Pessoa pessoa = new Pessoa("Saulo");

        pessoa.setCpf("988729038");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
    }
}
