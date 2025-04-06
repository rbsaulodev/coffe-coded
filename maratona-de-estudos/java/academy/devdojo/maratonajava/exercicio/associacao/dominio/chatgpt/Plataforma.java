package academy.devdojo.maratonajava.exercicio.associacao.dominio.chatgpt;

public class Plataforma {
    private String nome;
    private String site;

    public Plataforma(String nome, String site) {
        this.nome = nome;
        this.site = site;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
