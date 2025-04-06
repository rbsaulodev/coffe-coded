package academy.devdojo.maratonajava.javacore.sobreescrita.dominio;

public class Anime {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime {" +
                " nome = '" + nome + '\'' + " " +
                '}';
    }
}
