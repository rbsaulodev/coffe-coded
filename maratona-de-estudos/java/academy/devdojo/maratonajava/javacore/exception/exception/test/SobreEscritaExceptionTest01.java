package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreEscritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
