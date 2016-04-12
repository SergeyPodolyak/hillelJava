package Pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage arabika = new Arabica();
        Beverage robusta = new Robusta();
arabika = new Milk(arabika);
        arabika=new Milk(arabika);
        System.out.println(arabika.cost()+arabika.description());
            }



}
