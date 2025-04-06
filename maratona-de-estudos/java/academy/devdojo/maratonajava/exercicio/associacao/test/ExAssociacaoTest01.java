package academy.devdojo.maratonajava.exercicio.associacao.test;

import academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo.Aluno;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo.Local;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo.Professor;
import academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo.Seminario;

public class ExAssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Auditório Central - Rua das Flores, 123");
        Professor professor = new Professor("Carlos Mendes", "Especialidade: Ciência de Dados");

        Aluno aluno0 = new Aluno("Saulo", 19);
        Aluno aluno1 = new Aluno("Jessu", 26);
        Aluno aluno2 = new Aluno("Gabi", 20);

        Aluno alunos[] = {aluno1, aluno1, aluno2};

        Seminario seminario = new Seminario("Inteligência Artificial no Mundo Atual", local, alunos);
        Seminario seminario1 = new Seminario("Desenvolvimento Web Moderno", local, alunos);
        Seminario seminarios[] = {seminario, seminario1};

        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
