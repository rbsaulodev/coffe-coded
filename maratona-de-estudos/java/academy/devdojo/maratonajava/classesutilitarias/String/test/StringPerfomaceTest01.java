package academy.devdojo.maratonajava.classesutilitarias.String.test;

public class StringPerfomaceTest01 {
    public static void main(String[] args) {
        long inico = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para a String: " + (fim - inico) + " ms");
        System.out.println(" ");

        long inico2 = System.currentTimeMillis();
        concatStringBuilder(30_000);
        long fim2 = System.currentTimeMillis();

        System.out.println("Tempo gasto para a StringBuilder: " + (fim2 - inico2) + " ms");
        System.out.println(" ");

        long inico3 = System.currentTimeMillis();
        concatStringBuffer(30_000);
        long fim3 = System.currentTimeMillis();

        System.out.println("Tempo gasto para a StringBuilder: " + (fim3 - inico3) + " ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += 1;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
