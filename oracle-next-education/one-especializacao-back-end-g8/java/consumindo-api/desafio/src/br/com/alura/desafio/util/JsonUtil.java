package br.com.alura.desafio.util;

import com.google.gson.Gson;

public class JsonUtil {
    private static final Gson gson = new Gson();

    public static <T> T fromJson(String json, Class<T> classe) {
        return gson.fromJson(json, classe);
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }
}
