package academy.devdojo.maratonajava.javacore.enumeracoes.test;

import academy.devdojo.maratonajava.javacore.enumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracoes.dominio.TipoCliente;

import static academy.devdojo.maratonajava.javacore.enumeracoes.dominio.TipoPagamento.CREDITO;
import static academy.devdojo.maratonajava.javacore.enumeracoes.dominio.TipoPagamento.DEBTIO;
import static academy.devdojo.maratonajava.javacore.enumeracoes.dominio.TipoCliente.PESSOA_FISICA;
import static academy.devdojo.maratonajava.javacore.enumeracoes.dominio.TipoCliente.PESSOA_JURIDICA;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Saulo", PESSOA_FISICA, DEBTIO);
        Cliente cliente2 = new Cliente("Saulo", PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(DEBTIO.calcularDesconto(100));
        System.out.println(CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.pegarRelatorio("Pessoa Jurídica");
        TipoCliente tipoCliente2 = TipoCliente.pegarRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);
    }
}
