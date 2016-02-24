package OOP;

/**
 * Created by ADMIN on 24.02.16.
 */
public class Circule {
    int radius;
    double square;
    double circuleLength;

    //calculation of area
    public static double calculationSquare(int radius) {
        double square = (Math.pow(radius, 2)) * Math.PI;
        return square;
    }

    //calculation length of the circule
    public static double calculationCirculeLength(int radius) {
        double length = 2d * Math.PI * radius;
        return length;
    }

    //figure scaling
    void Scale(Circule c1, int k) {
        c1.radius = c1.radius * k;
        c1.square = (Math.pow(c1.radius, 2)) * Math.PI;
        c1.circuleLength = 2d * Math.PI * c1.radius;
    }

}
