package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pelé");
        Jogador neymar = new Jogador("Neymar J.");
        Jogador yuri = new Jogador("Yuri Alberto");

        Jogador[] jogadores = {pele, neymar, yuri};

        for (Jogador jogador :  jogadores){
            jogador.imprime();
        }

    }
}
