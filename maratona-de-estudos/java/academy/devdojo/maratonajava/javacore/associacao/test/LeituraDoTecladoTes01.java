package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTes01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = scanner.next();

        System.out.println("Digite seu sexo: ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Informações do Usuário");
        System.out.printf("Nome: %s \nSexo: %s \nIdade: %d", nome, sexo, idade);


    }
}
