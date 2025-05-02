package domain;

public enum TipoConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANCA("Conta Poupança"),
    CONTA_SALARIO("Conta Salário"),
    CONTA_DIGITAL("Conta Digital");

    public final String NOME_RELATORIO;

    TipoConta(String nome_relatorio) {
        this.NOME_RELATORIO = nome_relatorio;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
