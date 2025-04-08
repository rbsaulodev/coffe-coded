package academy.devdojo.maratonajava.classesutilitarias.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "rb";
        nome.concat("saulo");
        System.out.println(nome);

        //Se criar o sb vai criar ele com capacidade padrão de 16 caracteres;
        StringBuilder sb = new StringBuilder(nome);
        sb.append(".saulo");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
