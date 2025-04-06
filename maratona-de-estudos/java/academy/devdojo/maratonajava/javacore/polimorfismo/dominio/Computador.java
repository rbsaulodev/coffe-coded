package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.5;
    private String placaDeVideo;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
}
