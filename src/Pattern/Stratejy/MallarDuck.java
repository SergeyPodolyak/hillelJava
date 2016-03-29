package Pattern.Stratejy;

import Pattern.Fly.Fly;
import Pattern.Stratejy.Quakebl.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class MallarDuck extends Duck {
    public MallarDuck(){
        quakebl = new Quack();
        flyBehevour=new Fly();
    }

    @Override
    public void display() {
        System.out.println("Red head duck");
    }

}
