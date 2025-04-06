package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa saulo = new Pessoa();
        Pessoa maria = new Pessoa();

        saulo.setNome("Saulo");
        maria.setNome("Maria");
        saulo.setIdade(19);
        maria.setIdade(21);

        saulo.imprime();
        maria.imprime();
    }
}
