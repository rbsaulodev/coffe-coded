package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int valorDoCarro = 30000;
        int valorMaximaDaParcela = 1000;

        for (int i = valorDoCarro; i >= 1; i--) {
            double valorParcela = valorDoCarro / (double) i;

            if (valorParcela < valorMaximaDaParcela) {
                continue;      
            }
            System.out.println("Parcelas possíveis: " + i + " R$ " + valorParcela);
        }
    }
}
