package br.com.alura.desafio.model;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public String getCep() { return cep; }
    public String getLogradouro() { return logradouro; }
    public String getBairro() { return bairro; }
    public String getLocalidade() { return localidade; }
    public String getUf() { return uf; }

    @Override
    public String toString() {
        return """
            CEP: %s
            Logradouro: %s
            Bairro: %s
            Cidade: %s - %s
            """.formatted(cep, logradouro, bairro, localidade, uf);
    }
}
