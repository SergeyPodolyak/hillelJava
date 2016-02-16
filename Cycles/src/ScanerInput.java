import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScanerInput {
    public static void main(String[] args) {
       int a;
        int b;

        Scanner scanner=new Scanner (System. in);
        System.out.println("Inpuy first numer");
        a =  scanner.nextInt();
        System.out.println("Inpuy second numer");
        b =  scanner.nextInt();
        System.out.println("");
        int sum = a+b;
        System.out.println(sum);
    }
}

