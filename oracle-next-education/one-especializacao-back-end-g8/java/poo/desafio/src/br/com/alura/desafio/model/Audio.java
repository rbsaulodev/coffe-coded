package br.com.alura.desafio.model;

public abstract class Audio {
    private String titulo;
    private int duracaoEmSegundos;
    private boolean isReproduzindo;

    public Audio(String titulo, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public abstract String getTipo();

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracaoEmSegundos + " segundos");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public boolean isReproduzindo() {
        return isReproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        isReproduzindo = reproduzindo;
    }
}
