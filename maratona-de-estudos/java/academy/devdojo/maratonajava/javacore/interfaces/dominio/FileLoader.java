package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DateLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando Arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
