package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return this.salario += this.salario * 0.5;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                " nome='" + nome + '\'' +
                ", salario=" + salario +" "+
                '}';
    }

    @Override
    public void imprime() {

    }
}
