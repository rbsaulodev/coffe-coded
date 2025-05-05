package br.com.alura.desafio.model;

public enum TipoDeCartao {
    SILVER(1000.0),
    GOLD(2500.0),
    BLACK(5000.0),
    INFINITE(10000.0);

    private final double limite;

    TipoDeCartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}