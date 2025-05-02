package br.com.alura.desafio.model;

public class Musica extends Audio {
    private String artista;
    private String genero;

    public Musica(String titulo, int duracaoEmSegundos, String artista, String genero) {
        super(titulo, duracaoEmSegundos);
        this.artista = artista;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String getTipo() {
        return "Música";
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
    }
}
