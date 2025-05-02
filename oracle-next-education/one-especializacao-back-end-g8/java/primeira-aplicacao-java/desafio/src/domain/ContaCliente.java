package domain;

import java.util.Scanner;

public class ContaCliente {
    private String nome;
    private TipoConta tipoConta;
    private double saldoAtual;

    public ContaCliente(String nome, TipoConta tipoConta, double saldoInicial) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoInicial;
    }

    public void imprimirDadosDoCliente(){
        System.out.println("******************************");
        System.out.println("Dados do Cliente: ");
        System.out.println(" ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo da Conta: " + tipoConta.getNOME_RELATORIO());
        System.out.println("Saldo Atual: " + saldoAtual);
        System.out.println(" ");
        System.out.println("******************************");
    }

    public void textoDasOperacoesBancarias(){
        System.out.println(" ");
        System.out.println("Operações: ");
        System.out.println(" ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Deposito");
        System.out.println("3 - Transferência");
        System.out.println("4 - Sair");
        System.out.println(" ");
    }

    public void operacoesBanco(){
        int operacao = 0;
        Scanner scanner = new Scanner(System.in);
        while (operacao != 4){
            textoDasOperacoesBancarias();
            operacao = scanner.nextInt();
            switch (operacao){
                case 1:
                    System.out.println("Saldo Atual: " + this.saldoAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor que vai ser depositado: ");
                    double valor = scanner.nextDouble();
                    this.saldoAtual += valor;
                    System.out.println(" ");
                    System.out.println("Saldo Atual: " + this.saldoAtual);
                    break;
                case 3:
                    System.out.println("Digite o valor de transferência: ");
                    double valorDeTransferencia = scanner.nextInt();
                    this.saldoAtual -= valorDeTransferencia;
                    System.out.println(" ");
                    System.out.println("Saldo Atual: " + this.saldoAtual);
                    break;
                case 4:
                    System.out.println("Muito obrigad! Volte sempre ao Banco RB!");
                    break;
                default:
                    System.out.println("Erro: Operação Invalida");
                    break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
