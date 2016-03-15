package Pattern;

import Pattern.Fly.FlyBehevour;
import Pattern.Quakebl.Quakebl;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {
    Quakebl quakebl;
    FlyBehevour flyBehevour;
    public void fly() {
        flyBehevour.fly();
    }

    public void svim() {
        System.out.println("I am svim");
    }

    public void quak() {
        quakebl.quak();
    }
    public abstract void display();
}
