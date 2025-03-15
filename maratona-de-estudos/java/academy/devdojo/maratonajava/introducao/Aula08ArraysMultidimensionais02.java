package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];

        int [] array = {12, 11};

        arrayInt[0] = new int[]{6, 11};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{2005, 2004};

        int [][] arrayInt2 = {{0}, {1, 2} , {3, 4, 5}, {6, 7, 8, 9}};

        for (int[] number : arrayInt) {
            System.out.println("");
            for (int is : number) {
                System.out.print(is+" ");
            }
        }

        System.out.println("");

        for (int[] number : arrayInt2) {
            System.out.println("");
            for (int is : number) {
                System.out.print(is+" ");
            }
        }
    }
}
