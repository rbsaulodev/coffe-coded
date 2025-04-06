package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Televisao extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.5;

    private Boolean smart;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public Boolean getSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }

}
