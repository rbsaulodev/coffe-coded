package br.com.rb.screen_match.services;

public interface IConverteData {
    <T> T getData(String json, Class<T> tClass);
}
