package academy.devdojo.maratonajava.javacore.metodos.dominio;

public class ImpressoraEstudante {

    public void imprimir(Estudante estudante) {
        System.out.println("Estudante: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println(" ");
    }
}
