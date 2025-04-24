package academy.devdojo.maratonajava.classesutilitarias.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(bundle.containsKey("hello"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        Locale locale = bundle.getLocale();

        if (bundle.getLocale().equals(Locale.US)) {
            System.out.println("Em en_US");
            System.out.println(bundle.getString("hello"));
            System.out.println(bundle.getString("good.morning"));
        }else {
            System.out.println("Em pt_BR");
            System.out.println(bundle.getString("hello"));
            System.out.println(bundle.getString("good.morning"));
        }

    }
}
