package OOP;

/**
 * Created by ADMIN on 24.02.16.
 */
public class Figura {
    public static void main(String[] args) {
        Circule c1 = new Circule();
        c1.radius = 6;

        //Calculation of circulare parametrs
        c1.circuleLength = Circule.calculationCirculeLength(c1.radius);
        c1.square = Circule.calculationSquare(c1.radius);

        //Calculation some abstrakt square
        double someSquare = Circule.calculationSquare(10);

        //Print data of circulare
        System.out.println("Radius c1 = " + c1.radius);
        System.out.println("Square c1 = " + c1.square);
        System.out.println("Circule lengs c1 = " + c1.circuleLength);
        System.out.println("Square of some circule = " + someSquare);

        // Calculation of triangle
        Triangle t1 = new Triangle();
        t1.a = 2;
        t1.b = 5;
        t1.angleBetvinAandB = 60;
        t1.c = Triangle.CalculationSideC(t1.a, t1.b, t1.angleBetvinAandB);
        t1.square = Triangle.CalculationSquare(t1.a, t1.b, t1.angleBetvinAandB);
        //Print data of circulare
        System.out.println("Triangl side a = " + t1.a);
        System.out.println("Triangl side b = " + t1.b);
        System.out.println("Triangl side c = " + t1.c);
        System.out.println("Triangl Square  = " + t1.square);
    }
}
