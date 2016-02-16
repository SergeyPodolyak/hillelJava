import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerDelimeterExampl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        int a;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }

        int b;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }

        System.out.println("");
    }
}
