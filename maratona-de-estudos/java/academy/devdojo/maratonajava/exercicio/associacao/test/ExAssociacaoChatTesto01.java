package academy.devdojo.maratonajava.exercicio.associacao.test;

import academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt.Aluno;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt.Curso;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt.Plataforma;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt.Professor;

public class ExAssociacaoChatTesto01 {
    public static void main(String[] args) {
        Plataforma youtube = new Plataforma("Youtube", "youtube.com");
        Aluno saulo = new Aluno("Saulo", 19, "rb@exemplo.com");
        Curso curso = new Curso("IA para Front-ends", 134, youtube);
        Professor donizete = new Professor("Donizete", "Física");

        Aluno alunos[] = {saulo};
        Curso cursos[] = {curso};

        curso.setAlunos(alunos);
        saulo.setCursos(cursos);
        donizete.setCursos(cursos);

        donizete.imprimeCursosAlunos();
        System.out.println(" ");
        donizete.imprimeDadosProfessor();
    }

}
