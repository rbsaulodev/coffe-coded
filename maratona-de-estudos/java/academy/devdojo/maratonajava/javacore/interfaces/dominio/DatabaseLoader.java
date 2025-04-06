package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public class DatabaseLoader implements DateLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco...");
    }
}
