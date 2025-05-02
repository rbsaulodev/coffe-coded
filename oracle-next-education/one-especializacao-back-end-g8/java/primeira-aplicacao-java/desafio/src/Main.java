import domain.ContaCliente;
import static domain.TipoConta.CONTA_DIGITAL;

public class Main {
    public static void main(String[] args) {
        ContaCliente saulo = new ContaCliente("Saulo Rodrigues Brilhante", CONTA_DIGITAL, 2000);
        saulo.imprimirDadosDoCliente();
        saulo.operacoesBanco();
    }
}