public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double annualSalary = 7000;
        double taxe1 = 9.70/100;
        double taxe2 = 37.35/100;
        double taxe3 = 49.50/100;
        double valueTaxe;

        if (annualSalary <= 34712) {
            valueTaxe = annualSalary * taxe1;
        }else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valueTaxe = annualSalary * taxe2;
        }else{
            valueTaxe = annualSalary * taxe3;
        }
        System.out.println("Esse é o valor que irá pagar de impostos: "+valueTaxe);
    }
}
