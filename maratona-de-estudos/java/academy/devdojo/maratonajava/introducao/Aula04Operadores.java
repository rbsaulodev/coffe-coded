package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * 
        int number1 = 10;
        int number2 = 20;

        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int division = number2 / number1;
        int multiplication = number1 * number2;
        

        System.out.println("Soma: " + sum);
        System.out.println("Subtracao: " + subtraction);
        System.out.println("Divisao: " + division);
        System.out.println("Multiplicacao: " + multiplication);

        // % 
        int remainder = number2 % number1;
        System.out.println("Resto: " + remainder);

        // < > <= >= == !=
        int i = 10;
        boolean isDezMaiorQueVinte = i > 20;
        boolean isDezMenorQueVinte = i < 20;
        boolean isDezIgualVinte = i == 20;
        boolean isDezIgualDez = i == 10;
        boolean isDezDiferenteDez = i != 5;
        
        System.out.println("Dez e maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez e menor que vinte? " + isDezMenorQueVinte);
        System.out.println("Dez e igual a vinte? " + isDezIgualVinte);
        System.out.println("Dez e igual a dez? " + isDezIgualDez);
        System.out.println("Dez e diferente de dez? " + isDezDiferenteDez);

        // && (AND) || (OR)
        int age = 19;
        float salary = 3500;
        boolean isDentroDaLeiMairoQue30 = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQue30 = age <= 30 && salary >= 3381;
        
        System.out.println("Esta dentro da lei maior que 30? " + isDentroDaLeiMairoQue30);
        System.out.println("Esta dentro da lei menor que 30? " + isDentroDaLeiMenorQue30);

        double valorTotalNaConta = 500;
        double valorTotalNaPoupaça = 800;
        float valorNotebookLegionLenovo = 12000;

        boolean isNotebookCompravel = valorTotalNaConta >= valorNotebookLegionLenovo || valorTotalNaPoupaça >= valorNotebookLegionLenovo;
        System.out.println("E compravel o notebook: "+isNotebookCompravel);

        // += -= *= 
        double bonus = 1800;
        bonus += 2900;
        bonus -= 900;
        bonus *= 0.5;
        System.out.println("O bonus novo e de: "+bonus);
        
        int contador = 0;
        contador++; //adiciona 1 ao contador
        System.out.println(contador);
        contador--; //subtrai 1 ao contador;
        System.out.println(contador);


        //Diferença entre ++contador e contador++
        int contador2 = 0;
        System.out.println(++contador2); //Aqui vai imprimir 1 por que ele primeiro incremeta e dps executa
        System.out.println(contador2++); //Aqui vai imprimir 0 por que ele executa o print e dps incremeta
    }   
}