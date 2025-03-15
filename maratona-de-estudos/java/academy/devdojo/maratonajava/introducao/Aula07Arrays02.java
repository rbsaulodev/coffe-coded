package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, floar e double = 0
        //char '\u0000'
        //boolean false
        //String null
        boolean [] trueOrFalse = new boolean[3];
        System.out.println(trueOrFalse[0] + ", " + trueOrFalse[1] + ", " + trueOrFalse[2]);

        int [] ages = new int[3];
        System.out.println(ages[0] + ", " + ages[1] + ", " + ages[2]);

        char [] caractere = new char[3];
        System.out.println(caractere[0] + ", " + caractere[1] + ", " + caractere[2]);

        String [] animes = new String[3] ;
        animes[0] = "Ichigo";
        animes[1] = "Kon";
        animes[2] = "Luffy";

        //Como percorer um array
        for(int i = 0; i < 3; i++){
            System.out.println(animes[i]);
        }
    }
}
