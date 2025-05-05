import br.com.alura.desafio.model.Cartao;
import br.com.alura.desafio.model.Item;
import br.com.alura.desafio.model.TipoDeCartao;
import br.com.alura.desafio.model.TipoPagamento;
import br.com.alura.desafio.model.User;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("João Silva", null, 30);
        Cartao cartao = new Cartao(12345, usuario, TipoDeCartao.GOLD, TipoPagamento.CREDITO, 1000.0);

        usuario = new User(usuario.getNome(), cartao, usuario.getIdade());

        cartao.realizarCompra(new Item("Celular", 800.0));
        cartao.realizarCompra(new Item("Fones de Ouvido", 150.0));
        cartao.realizarCompra(new Item("Carregador", 50.0));

        System.out.println("=== Bem-vindo ao Sistema de Cartão ===");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Saldo inicial: R$ 1000,00");
        System.out.println("====================================");

        cartao.userAcoes();
    }
}