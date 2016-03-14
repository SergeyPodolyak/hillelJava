package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 14.03.16.
 */
public class OilPaint extends Paint {
    private int consuption;

    public OilPaint(int r, int g, int b) {
        super(r, g, b);
        this.consuption = 20;
    }

    public int getConsumption() {
        return consuption;
    }


}
