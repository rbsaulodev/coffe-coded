package academy.devdojo.maratonajava.javacore.modificadorstatic.test;

import academy.devdojo.maratonajava.javacore.modificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(200);
        Carro miata =  new Carro("Mazda MX-5", 150);
        Carro sonata =  new Carro("Hyndai Sonata", 200);

        miata.imprime();
        sonata.imprime();

    }
}
