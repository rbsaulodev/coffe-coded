package br.com.alura.screenmatch.calculo;

public class Recomendacao {
    public void filtraTitulo(Classificavel classificavel) {
        if (classificavel.getClassifcavel() >= 4){
            System.out.println("Muito bem avaliado!");
        } else if (classificavel.getClassifcavel() >= 2 && classificavel.getClassifcavel() < 4) {
            System.out.println("Vale a pena dar uma chance!");
        }else {
            System.out.println("Mal avaliado");
        }
    }
}
