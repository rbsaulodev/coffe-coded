package academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt;

public class Curso {
    private String titulo;
    private int duracao;
    private Aluno[] alunos;
    private Plataforma plataforma;

    public Curso(String titulo, int duracao, Plataforma plataforma) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.plataforma = plataforma;
    }

    public Curso(String titulo, int duracao, Aluno[] alunos, Plataforma plataforma) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.alunos = alunos;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}
