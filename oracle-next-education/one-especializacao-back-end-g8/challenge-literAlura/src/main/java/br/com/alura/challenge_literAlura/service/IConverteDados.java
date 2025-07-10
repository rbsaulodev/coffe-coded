package br.com.alura.challenge_literAlura.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}