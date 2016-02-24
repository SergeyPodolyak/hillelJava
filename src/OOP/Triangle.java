package OOP;

/**
 * Created by ADMIN on 24.02.16.
 */
public class Triangle {
    int a;
    int b;
    double c;
    int angleBetvinAandB;
    double square;
    public static double CalculationSideC(int a, int b, int angle ){
        double c=Math.pow(a,2)+Math.pow(b,2)+2*a*b*Math.cos(angle);
        return c;
    }
    public static double CalculationSquare(int a, int b, int angle ){
        double square=((double) (a*b*2)*(double) (Math.sin(angle)))/4;
        return square;
    }


}
