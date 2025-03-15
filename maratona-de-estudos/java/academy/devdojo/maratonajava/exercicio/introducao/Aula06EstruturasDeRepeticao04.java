package academy.devdojo.maratonajava.exercicio.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra os valores de cada parcela levando em consideração o maximo de 1000 reais
    //Sem juros
    public static void main(String[] args) {

        int valorDoCarro = 30000;
        int valorMaximaDaParcela = 1000;

        for (int i = 1; i <= valorDoCarro; i++) {
            double valorParcela = valorDoCarro / (double) i;
            if (valorParcela < valorMaximaDaParcela) {
                break;      
            }

            System.out.println("Parcelas possíveis: "+i+ " R$ "+valorParcela);
        }
    }

}
