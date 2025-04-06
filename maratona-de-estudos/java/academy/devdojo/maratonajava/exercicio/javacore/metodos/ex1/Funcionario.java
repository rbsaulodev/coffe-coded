package academy.devdojo.maratonajava.exercicio.javacore.metodos.ex1;

import java.util.Arrays;

//Crie uma class funcionario com seguites atributos: nome idade e salario (Obs.: 3 salarios tem que ser guardados)
//Crie dois metodos: Para imprimir os dados e outro para tirar a média e impirmir o resultado

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimir() {
        if (salario == null)
            return;

        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double value : salario) {
            System.out.print(value + " ");
        }
    }

    public void mediaDeSalario() {
        if (salario == null || salario.length == 0) {
            System.out.println("Por favor, preencha o campo de salário corretamente!");
            return;
        }

        double soma = 0;
        for (double value : salario) {
            soma += value;
        }
        double media = soma / salario.length;
        System.out.println("A média dos salários é: " + media);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
