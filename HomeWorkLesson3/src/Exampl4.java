import java.util.*;
import java.util.Scanner;

/**
 * Created by ADMIN on 21.02.16.
 */
public class Exampl4 {
    public static void main(String[] args) {
        Scanner scannerOfVariant = new Scanner(System.in);
        System.out.println("Make a choice" );
        System.out.println("Insert 1 -  conwert binary to decemal" );
        System.out.println("Insert 2 -  conwert decemal to binary" );
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
