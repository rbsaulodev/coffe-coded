package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pelé");
        Jogador nyj = new Jogador("Neymar Junior");
        Jogador[] jogadores = {pele,nyj};

        Time time = new Time("Brasil");

        pele.setTime(time);
        nyj.setTime(time);
        time.setJogadores(jogadores);

        time.imprime();
        System.out.println(" ");
        pele.imprime();
        System.out.println(" ");
        nyj.imprime();
    }
}
