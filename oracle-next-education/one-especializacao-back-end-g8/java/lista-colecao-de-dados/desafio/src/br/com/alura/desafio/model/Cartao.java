package br.com.alura.desafio.model;

import br.com.alura.desafio.service.CartaoService;

import java.util.ArrayList;

public class Cartao implements CartaoService{
    private int conta;
    private User user;
    private TipoDeCartao tipoDeCartao;
    private TipoPagamento tipoPagamento;
    private double saldo;
    private double limiteDisponivel;
    private ArrayList<Item> compras = new ArrayList<>();

    public Cartao(int conta, User user, TipoDeCartao tipoDeCartao, TipoPagamento tipoPagamento, double saldo) {
        this.conta = conta;
        this.user = user;
        this.tipoDeCartao = tipoDeCartao;
        this.tipoPagamento = tipoPagamento;
        this.saldo = saldo;
        this.limiteDisponivel = tipoDeCartao.getLimite();
    }

    public Cartao(int conta, User user, TipoDeCartao tipoDeCartao, TipoPagamento tipoPagamento) {
        this.conta = conta;
        this.user = user;
        this.tipoDeCartao = tipoDeCartao;
        this.tipoPagamento = tipoPagamento;
        this.limiteDisponivel = tipoDeCartao.getLimite();
        this.saldo = 0;
    }

    private void exibirCompras() {
        if (compras.isEmpty()) {
            System.out.println("Não há compras registradas.");
            return;
        }

        for (int i = 0; i < compras.size(); i++) {
            Item item = compras.get(i);
            System.out.printf("%d. %s - R$ %.2f%n",
                    i + 1,
                    item.getNome(),
                    item.getValor());
        }
    }

    @Override
    public void userAcoes() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao = 0;

        while (opcao != -1) {
            System.out.println("\n========== MENU DO CARTÃO ==========");
            System.out.println("Usuário: " + this.user.getNome());
            System.out.println("Cartão: " + this.tipoDeCartao);
            System.out.println("==================================");
            System.out.println("0 - Consultar saldo e limite");
            System.out.println("1 - Realizar compra");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Realizar depósito");
            System.out.println("4 - Ver compras (maior para menor valor)");
            System.out.println("5 - Ver compras (menor para maior valor)");
            System.out.println("-1 - Sair");
            System.out.println("==================================");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 0:
                        restanteDoLimite();
                        break;
                    case 1:
                        System.out.print("Digite o nome do item: ");
                        String nomeItem = scanner.nextLine();
                        System.out.print("Digite o valor do item: R$ ");
                        double valorItem = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer

                        Item novoItem = new Item(nomeItem, valorItem);
                        realizarCompra(novoItem);
                        break;
                    case 2:
                        System.out.print("Digite o valor para saque: R$ ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer
                        realizarSaque(valorSaque);
                        break;
                    case 3:
                        System.out.print("Digite o valor para depósito: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer
                        realizarDeposito(valorDeposito);
                        break;
                    case 4:
                        ordenarComprasMaiorPreco();
                        break;
                    case 5:
                        ordenarComprasMenorPreco();
                        break;
                    case -1:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                if (opcao != -1) {
                    System.out.println("\nPressione ENTER para continuar...");
                    scanner.nextLine();
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
            }
        }
    }

    @Override
    public void realizarCompra(Item item) {
        double valor = item.getValor();

        if (!podeComprar(item)) {
            System.out.println("Saldo e limite insuficientes!");
            return;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Compra feita com saldo.");
        } else {
            double restante = valor - this.saldo;
            this.saldo = 0;
            this.limiteDisponivel -= restante;
            System.out.println("Compra feita com saldo + limite.");
        }

        this.compras.add(item);
    }

    @Override
    public void realizarSaque(Double valor) {
        if (valor < 0){
            System.out.println("Não pode saque negativo!");
            return;
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficente");
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque feito!");
    }

    @Override
    public void realizarDeposito(Double valor) {
        if (valor < 0){
            System.out.println("Não pode deposito negativo!");
            return;
        }
        this.saldo += valor;
        System.out.println("Deposito feito!");
    }

    @Override
    public void restanteDoLimite() {
        System.out.printf("Saldo disponível: R$ %.2f%n", this.saldo);
        System.out.printf("Limite disponível: R$ %.2f%n", this.limiteDisponivel);
        System.out.printf("Total disponível para compras: R$ %.2f%n", this.saldo + this.limiteDisponivel);
    }

    @Override
    public void ordenarComprasMaiorPreco() {
        compras.sort((item1, item2) -> Double.compare(item2.getValor(), item1.getValor()));
        System.out.println("Compras ordenadas do maior para o menor valor:");
        exibirCompras();
    }

    @Override
    public void ordenarComprasMenorPreco() {
        compras.sort((item1, item2) -> Double.compare(item1.getValor(), item2.getValor()));
        System.out.println("Compras ordenadas do menor para o maior valor:");
        exibirCompras();
    }

    @Override
    public boolean podeComprar(Item item) {
        return item.getValor() <= this.saldo + this.tipoDeCartao.getLimite();
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "conta=" + conta +
                ", user=" + user +
                ", tipoDeCartao=" + tipoDeCartao +
                ", tipoPagamento=" + tipoPagamento +
                ", saldo=" + saldo +
                ", limiteDisponivel=" + limiteDisponivel +
                ", compras=" + compras +
                '}';
    }
}