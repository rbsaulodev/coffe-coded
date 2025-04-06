package academy.devdojo.maratonajava.javacore.enumeracoes.dominio;

public enum TipoPagamento {
    DEBTIO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    public abstract double calcularDesconto(double valor);
}
