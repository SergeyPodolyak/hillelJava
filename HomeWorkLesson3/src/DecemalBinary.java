import java.util.*;
import java.util.Scanner;

/**
 * Created by ADMIN on 21.02.16.
 */
public class DecemalBinary {
    public static void decemalToBinary() {
        int[] binarNumber = new int[32];
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  number ");
        a = scanner.nextInt();
        for (int i = 31; i > -1; i--) {
            b = a % 2;
            a = a / 2;
            if (b > 0) {
                binarNumber[i] = 1;
            } else {
                binarNumber[i] = 0;
            }
        }
        System.out.print("Number=");
        for (int i = 0; i < 32; i++) {
            System.out.print(binarNumber[i]);

        }


    }
    public static void binaryToDecemal(){
        int[] binaryNumber={0,0,0,1,1,0,0,0,1};
                double decemalNumber=0;

        for (int i=0; i<binaryNumber.length;i++){

            decemalNumber=decemalNumber+(binaryNumber[i]*(Math.pow(2,(8-i))));
        }
        System.out.println(decemalNumber);
    }
}
