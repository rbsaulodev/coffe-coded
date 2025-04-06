package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor toledo = new Professor("Luciana Toledo");
        Professor patty = new Professor("Patricia");
        Professor[] professores = {toledo, patty};
        Escola iftm = new Escola("IFTM - Campus Ituiutaba", professores);

        iftm.imprime();
    }
}
