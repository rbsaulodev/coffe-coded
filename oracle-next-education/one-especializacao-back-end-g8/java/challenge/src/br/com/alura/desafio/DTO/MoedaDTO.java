package br.com.alura.desafio.DTO;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class MoedaDTO {

    @SerializedName("base_code")
    private String nome;

    @SerializedName("conversion_rates")
    private Map<String, Double> conversao;

    public String getNome() {
        return nome;
    }

    public Map<String, Double> getConversao() {
        return conversao;
    }
}
