package academy.devdojo.maratonajava.javacore.enumeracoes.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    TipoCliente(int valor, String nome_relatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nome_relatorio;
    }

    public static TipoCliente pegarRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNOME_RELATORIO().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
