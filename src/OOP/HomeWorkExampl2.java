package OOP;

import java.util.Scanner;

/**
 * Created by ADMIN on 25.02.16.
 */
public class HomeWorkExampl2 {
    public static void main(String[] args) {
        calculationOfTheRectangleSides();
    }

    private static void calculationOfTheRectangleSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arrea of rectangle");
        double area = scanner.nextDouble();
        System.out.println("Input perimetr of rectangle");
        double perimetr = scanner.nextDouble();
        Rectangle rectangel = new Rectangle();
        String message = Rectangle.calculationSidesWithAreaAndPerimeter(rectangel, area, perimetr);
        System.out.println(message);
        System.out.println("Rectangl side a = " + rectangel.a);
        System.out.println("Rectangl side b = " + rectangel.b);
        System.out.println("Rectangl square = " + rectangel.square);
        System.out.println("Rectangl perimetr = " + rectangel.perimetr);

    }
}
