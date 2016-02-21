import java.util.*;
import java.util.Scanner;

/**
 * Created by ADMIN on 21.02.16.
 */
public class Exampl4 {
    public static void main(String[] args) {
        Scanner scannerOfVariant = new Scanner(System.in);
        System.out.println("If you whant conwert binary to decemal insert number 1, or from decemal to binary insert 2" );
        int a = scannerOfVariant.nextInt();
        switch (a){
            case 1: DecemalBinary.binaryToDecemal();
                break;
            case 2: DecemalBinary.decemalToBinary();
                break;
            default: System.out.println("This variant is exist");
                break;
        }
    }

}
