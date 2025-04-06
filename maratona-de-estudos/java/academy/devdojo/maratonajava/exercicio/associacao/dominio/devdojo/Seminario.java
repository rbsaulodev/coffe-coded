package academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + this.local);

        if (alunos == null) {
            System.out.println("Não tem nenhum aluno");
        }
        assert alunos != null;
        for (Aluno aluno : alunos){
            System.out.print(aluno);
        }
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }



    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
