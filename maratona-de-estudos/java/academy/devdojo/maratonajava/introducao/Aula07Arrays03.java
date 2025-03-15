package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] number = new int[3];
        int [] number2 = {1,2,3,4,5};

        System.out.println("For normal");
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        System.out.println("");
        System.out.println("Foreach");

        for (int i : number) {
            System.out.println(i);
        }
        
        for (int i : number2) {
            System.out.println(i);
        }


    }
}
