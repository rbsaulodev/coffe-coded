package br.com.br.desafio.serivces;

import java.util.List;

public interface IConverteDados {
    <T> T getData(String json, Class<T> tClass);
    <T> List<T> getList(String json, Class<T> tClass);
}
