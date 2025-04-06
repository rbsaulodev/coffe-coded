package academy.devdojo.maratonajava.exercicio.javacore.metodos.ex1;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario patrola = new Funcionario();
        patrola.setNome("Patrcky");
        patrola.setIdade(21);
        patrola.setSalario(new double[]{10, 30, 50});

        patrola.imprimir();
        patrola.mediaDeSalario();

    }
}
