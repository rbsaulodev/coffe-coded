package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodio;

    {
        episodio = new int[1100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep : episodio)
            System.out.print(ep + " ");

        System.out.println(" ");
    }

    public String getAnime() {
        return nome;
    }

    public void setAnime(String anime) {
        this.nome = anime;
    }

    public int[] getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int[] episodio) {
        this.episodio = episodio;
    }
}
