package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int i : anime.getEpisodio()) {
            System.out.print(i + " ");
        }

    }
}
