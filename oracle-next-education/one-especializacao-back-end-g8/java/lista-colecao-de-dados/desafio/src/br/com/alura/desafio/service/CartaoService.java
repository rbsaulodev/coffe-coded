package br.com.alura.desafio.service;

import br.com.alura.desafio.model.Item;

public interface CartaoService {
    void userAcoes();
    void realizarCompra(Item item);
    void realizarSaque(Double valor);
    void realizarDeposito(Double valor);
    void restanteDoLimite();
    void ordenarComprasMaiorPreco();
    void ordenarComprasMenorPreco();
    boolean podeComprar(Item item);
}