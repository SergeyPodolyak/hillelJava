package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 14.03.16.
 */
public abstract class Paint {
    private int r;
    private int g;
    private int b;


    public Paint(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

    }

    public abstract int getConsumption();


    @Override
    public String toString() {
        return "r= " + r + ", g= " + g + ", b= " + b + ", Consuption= " + getConsumption();
    }

}
