package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio1 = new RepositorioMemoria();
        Repositorio repositorio2 = new RepositorioBancoDeDados();

        repositorio.salvar();
        repositorio1.salvar();
        repositorio2.salvar();
    }
}
