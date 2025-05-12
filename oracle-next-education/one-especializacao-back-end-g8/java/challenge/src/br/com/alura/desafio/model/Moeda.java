package br.com.alura.desafio.model;

import br.com.alura.desafio.DTO.MoedaDTO;
import java.util.Map;

public class Moeda {
    private String nome;
    private Map<String, Double> conversao;

    public Moeda(MoedaDTO dto) {
        this.nome = dto.getNome();
        this.conversao = dto.getConversao();
    }

    public Double getConversaoPara(String codigoMoeda) {
        return conversao.get(codigoMoeda);
    }
}
