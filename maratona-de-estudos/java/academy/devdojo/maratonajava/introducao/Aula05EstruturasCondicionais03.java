package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // (condicao) ? verdadeiro : falso;

        double salary =  5000;
        String msgDoar =  "Eu vou doar 500 pro DevDojo";
        String msgNaoDoar =  "Ainda não tenho condições, mas vou ter!";

        String resultado = salary > 5000 ? msgDoar : msgNaoDoar;
        System.out.println(resultado);
    }
}
