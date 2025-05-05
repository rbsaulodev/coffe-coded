package br.com.alura.desafio.model;

public class User {
    private String nome;
    private Cartao cartao;
    private int idade;

    public User(String nome, Cartao cartao, int idade) {
        this.nome = nome;
        this.cartao = cartao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public int getIdade() {
        return idade;
    }
}
