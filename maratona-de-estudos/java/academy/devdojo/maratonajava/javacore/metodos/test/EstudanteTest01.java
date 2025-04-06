package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Saulo";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
