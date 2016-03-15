package Pattern;

import Pattern.Fly.CantFly;
import Pattern.Quakebl.Squiz;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        quakebl=new Squiz();
        flyBehevour=new CantFly();
    }



    @Override
    public void display(){
        System.out.println("I a rubber duk");
    }



}
