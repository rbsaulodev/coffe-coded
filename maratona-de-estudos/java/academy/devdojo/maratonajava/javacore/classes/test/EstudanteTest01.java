package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante sauloEstudante = new Estudante();
        sauloEstudante.nome = "Saulo";
        sauloEstudante.idade = 19;
        sauloEstudante.sexo = 'M';

        System.out.println(sauloEstudante.nome);
        System.out.println(sauloEstudante.idade);
        System.out.println(sauloEstudante.sexo);
    }
}
