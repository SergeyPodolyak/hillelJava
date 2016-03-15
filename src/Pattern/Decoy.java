package Pattern;

/**
 * Created by User on 15.03.2016.
 */
public class Decoy extends Duck{


    @Override
    public void svim() {
        System.out.println("I cant svim");
    }

    @Override
    public void display() {
        System.out.println("decoy");
    }
}
