package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 14.03.16.
 */
public class Rectangle extends Figura {
    private int a;
    private int b;
    private Paint paint;

    public Rectangle(int a, int b, Paint paint) {
        this.a = a;
        this.b = b;
        this.paint = paint;

    }

    public double getArea() {
        return a * b;
    }

    public double getPaintQuantity() {
        return getArea() * paint.getConsumption();
    }

    public String toString() {
        return "Side a=" + a + ", Side b=" + b + ", Colored by " + paint;
    }
}
