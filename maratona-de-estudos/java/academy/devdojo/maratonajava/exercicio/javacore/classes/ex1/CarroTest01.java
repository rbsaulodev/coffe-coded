package academy.devdojo.maratonajava.exercicio.javacore.classes.ex1;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro sonata = new Carro();
        Carro miata = new Carro();

        sonata.nome = "Hyundai Sonata";
        sonata.modelo = "Sedan";
        sonata.ano = 2017;

        miata.nome = "Mazda MX-5";
        miata.modelo = "Miata";
        miata.ano = 1989;

        System.out.println("Meu carro dos sonhos: " +sonata.nome+ ", Modelo: " +sonata.modelo+ ", Ano: " +sonata.ano);
        System.out.println("Meu sonho de criança: " +miata.nome+ ", Modelo: " +miata.modelo+ ", Ano: " +miata.ano);
    }
}
