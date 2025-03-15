package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];

        for (int i = 0; i < dias.length; i++) {
            System.out.println("");
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("");

        //For each
        for(int [] dia : dias){
            System.out.println("");
            for(int num : dia){
                System.out.println(num);
            }
        }
    }
}
