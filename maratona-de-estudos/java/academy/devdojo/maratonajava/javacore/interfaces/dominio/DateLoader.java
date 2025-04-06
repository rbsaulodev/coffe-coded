package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DateLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
