package academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt;

public class Professor {
    private String nome;
    private String especializacao;
    private Curso[] cursos;

    public void imprimeCursosAlunos(){
        if (cursos == null){
            return;
        }
        for(Curso curso : cursos){
            System.out.println(curso.getTitulo());
            System.out.println(curso.getDuracao());
            if (curso.getAlunos() == null){
                return;
            }
            for (Aluno aluno : curso.getAlunos()){
                System.out.print(aluno.getNome());
                System.out.println("");
            }
        }
    }

    public void imprimeDadosProfessor(){
        System.out.println(this.nome);
        System.out.println(this.especializacao);
        if (cursos == null){
            return;
        }
        for (Curso curso : cursos){
            System.out.println(curso.getTitulo());
        }
    }

    public Professor(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public Professor(String nome, String especializacao, Curso[] cursos) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
