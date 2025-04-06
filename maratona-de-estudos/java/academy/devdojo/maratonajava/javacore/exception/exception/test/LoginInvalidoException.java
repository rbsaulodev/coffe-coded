package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.util.Scanner;

public class LoginInvalidoException extends Throwable {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usernameDB = "Saulo";
        String senhaDB = "123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("User: ");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if(!usernameDB.equals(userNameDigitado) || (!senhaDB.equals(senhaDigitada))){
            throw new LoginInvalidoException();
        }

        System.out.println("Login feito com sucesso!");
    }
}
