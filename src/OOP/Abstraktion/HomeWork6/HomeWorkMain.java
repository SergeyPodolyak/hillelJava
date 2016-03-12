package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public class HomeWorkMain {
    public static void main(String[] args) {
        Wolf jack = new Wolf(123135431, 15, 1, "grey");
        System.out.println(jack.voice());
        System.out.println(jack);

        Fish fish = new Fish(1231, 2, 1, "Red");
        fish.setName("Marmishka");
        System.out.println(fish.voice());
        System.out.println(fish);
        Dog kuzy = new Dog(156446, 5, 5, "Black", "Kuzya", true);
        System.out.println(kuzy.voice());
        System.out.println(kuzy);
GuideDog mango = new GuideDog(12,1,2,"dfdv","Mango",true,true);
        System.out.println(mango.voice());
        System.out.println(mango);

    }
}
