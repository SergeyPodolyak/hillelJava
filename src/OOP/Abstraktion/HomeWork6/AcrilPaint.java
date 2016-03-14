package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 14.03.16.
 */
public class AcrilPaint extends Paint {
    private int consumption;

    public AcrilPaint(int r, int g, int b) {
        super(r, g, b);
        this.consumption = 15;
    }

    public int getConsumption() {
        return consumption;
    }


}
