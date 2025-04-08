package academy.devdojo.maratonajava.javacore.whapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'M';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        //Boxing
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'M';
        Boolean booleanW = true;

        //Unboxing
        // int i = intW;

        int i1 = Integer.parseInt("2");
        System.out.println(i1);
        System.out.println(Character.isAlphabetic('S'));
        System.out.println(Character.isDigit('9'));

    }
}
