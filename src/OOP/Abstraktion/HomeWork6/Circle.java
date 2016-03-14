package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 14.03.16.
 */
public class Circle extends Figura {
    private double r;
    private Paint paint;

    public Circle(int r, Paint paint) {
        this.r = r;
        this.paint = paint;
    }

    public double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }

    public double getPaintQuantity() {
        return getArea() * paint.getConsumption();
    }

    @Override
    public String toString() {
        return "Radius= " + r + ", Area=" + getArea() + "Colored by " + paint;
    }
}
