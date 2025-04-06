package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
       return this.salario += this.salario * 0.3;
    }

    @Override
    public String toString() {
        return "Gerente {" +
                " nome='" + nome + '\'' +
                ", salario=" + salario +" "+
                '}';
    }

    @Override
    public void imprime() {

    }
}
