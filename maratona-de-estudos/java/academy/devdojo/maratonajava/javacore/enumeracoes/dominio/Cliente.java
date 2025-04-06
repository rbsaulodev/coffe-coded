package academy.devdojo.maratonajava.javacore.enumeracoes.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento pagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo.NOME_RELATORIO +
                ", tipoInt=" + tipo.VALOR +
                ", pagamento=" + pagamento +
                '}';
    }
}
