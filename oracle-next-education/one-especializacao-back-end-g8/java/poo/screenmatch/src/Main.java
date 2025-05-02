import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Recomendacao recomendacao = new Recomendacao();

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
        int classificacaoSerie = fbi.getClassifcavel();
        System.out.println("Classificação: " + classificacaoSerie);
        recomendacao.filtraTitulo(fbi);
    }
}

