package OOP;

/**
 * Created by ADMIN on 24.02.16.
 */
public class Rectangle {
    double a;
    double b;
    double square;
    double perimetr;

    //calculation of area
    public static double calculationSquare(int a, int b) {
        double square = a * b;
        return square;
    }

    //figure scaling
    void scale(Rectangle r1, int k) {
        r1.a = r1.a * k;
        r1.b = r1.b * k;
        r1.square = r1.a * r1.b;
    }

    //the calculation of the sides on the perimeter and area
    public static String calculationSidesWithAreaAndPerimeter(Rectangle r1, double area, double perimetr) {
        String message;
        double tempD;
        double tempA1;
        double tempB1;
        tempD = (Math.pow(-1 * perimetr / 2, 2)) - (4 * area);
        if (tempD < 0) {
            message = "Sides of the rectangle are complex numbers";
        } else {
            tempA1 = (perimetr / 2 + Math.sqrt(tempD)) / 2;
            tempB1 = (perimetr / 2 - Math.sqrt(tempD)) / 2;
            r1.a = tempA1;
            r1.b = tempB1;
            r1.square = area;
            r1.perimetr = perimetr;
            message = "Wi finde solution";
        }


        return message;

    }
}

