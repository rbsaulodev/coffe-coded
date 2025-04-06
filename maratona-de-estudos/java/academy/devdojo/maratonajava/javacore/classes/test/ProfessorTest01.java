package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor marcelo = new Professor();
        marcelo.nome = "Marcelo";
        marcelo.idade = 59;
        marcelo.sexo = 'M';
        System.out.println(marcelo.nome + " " + marcelo.idade + " " + marcelo.sexo);
    }
}
