package OOP;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinic {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Murzik", "Grey", 1985);
        Cat catTom = new Cat("Morkov", "kjvjkkjh", 1986);
        catMurzik.vaccination("SACC");
        System.out.println(catMurzik.getBirthYear());
        System.out.println(catMurzik.getName());
        System.out.println(catMurzik.getColor());


        //catMurzik.color = ;
        // catMurzik.birthYear = ;
        // catMurzik.name = ;

        // catMurzik.vaccine = new String[10];
        //catMurzik.vaccine[0] = "ASCC";
        //vaccinaciya(catMurzik);
        //System.out.println(Arrays.toString(catMurzik.vaccine));

    }

}
