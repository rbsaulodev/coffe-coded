import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.service.ListasDeAssistidos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Recomendacao recomendacao = new Recomendacao();
        ListasDeAssistidos listasDeAssistidos = new ListasDeAssistidos();

        Filme filme1 = new Filme(
                "Interestelar",
                2014,
                169,
                "Christopher Nolan"
        );
        filme1.adicionaAvaliacao(10);
        filme1.adicionaAvaliacao(9);
        filme1.adicionaAvaliacao(10);
        filme1.imprimeInformacoes();
        int classificacaoFilme = filme1.getClassifcavel();
        System.out.println("Classificação: " + classificacaoFilme);
        recomendacao.filtraTitulo(filme1);

        System.out.println(" ");

        Filme filme2 = new Filme(
                "A Origem",
                2010,
                148,
                "Christopher Nolan"
        );
        filme2.adicionaAvaliacao(9);
        filme2.adicionaAvaliacao(10);
        filme2.adicionaAvaliacao(8);
        filme2.imprimeInformacoes();
        System.out.println("Classificação: " + filme2.getClassifcavel());
        recomendacao.filtraTitulo(filme2);

        System.out.println(" ");

        Filme filme3 = new Filme(
                "O Senhor dos Anéis: O Retorno do Rei",
                2003,
                201,
                "Peter Jackson"
        );
        filme3.adicionaAvaliacao(10);
        filme3.adicionaAvaliacao(10);
        filme3.adicionaAvaliacao(9);
        filme3.imprimeInformacoes();
        System.out.println("Classificação: " + filme3.getClassifcavel());
        recomendacao.filtraTitulo(filme3);

        System.out.println(" ");

        Serie fbi = new Serie(
                "FBI",
                2018,
                45,
                6,
                true,
                22
        );
        fbi.adicionaAvaliacao(8);
        fbi.adicionaAvaliacao(9);
        fbi.adicionaAvaliacao(7);
        fbi.adicionaAvaliacao(10);
        fbi.imprimeInformacoes();
        System.out.println("Classificação: " + fbi.getClassifcavel());
        recomendacao.filtraTitulo(fbi);

        System.out.println(" ");

        Serie serie2 = new Serie(
                "Stranger Things",
                2016,
                50,
                4,
                false,
                8
        );
        serie2.adicionaAvaliacao(10);
        serie2.adicionaAvaliacao(9);
        serie2.adicionaAvaliacao(9);
        serie2.imprimeInformacoes();
        System.out.println("Classificação: " + serie2.getClassifcavel());
        recomendacao.filtraTitulo(serie2);

        System.out.println(" ");

        Serie serie3 = new Serie(
                "Breaking Bad",
                2008,
                47,
                5,
                false,
                13
        );
        serie3.adicionaAvaliacao(10);
        serie3.adicionaAvaliacao(10);
        serie3.adicionaAvaliacao(9);
        serie3.adicionaAvaliacao(10);
        serie3.imprimeInformacoes();
        System.out.println("Classificação: " + serie3.getClassifcavel());
        recomendacao.filtraTitulo(serie3);

        ArrayList<Filme> meusFilmes = new ArrayList<>();
        meusFilmes.add(filme1);
        meusFilmes.add(filme2);
        meusFilmes.add(filme3);

        System.out.println(" ");
        System.out.println("Nome do Primeiro filme da sua lista: " + meusFilmes.get(0).getNome());
        System.out.println(meusFilmes);

        listasDeAssistidos.addTitulo(serie2);
        listasDeAssistidos.addTitulo(serie3);
        listasDeAssistidos.addTitulo(fbi);
        listasDeAssistidos.mostraTitulos();
    }
}
