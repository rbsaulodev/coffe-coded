package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while e for
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count+" while");
        }

        System.out.println("");

        count = 0;
        do { 
            ++count;
            System.out.println(count+" do while");
        } while (count <= 10);

        System.out.println("");

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i+" for");
        }
    }
}
