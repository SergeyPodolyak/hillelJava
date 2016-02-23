package intro;

import java.util.Scanner;

/**
 * Created by ADMIN on 18.02.16.
 */
public class HW_ArraysExampl9 {
    public static void main(String[] args) {
        int[] binarNumber = new int [32];
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  number ");
        a = scanner.nextInt();
        for(int i=31; i>-1;i--){
            b=a%2;
            a=a/2;
            if(b>0){
                binarNumber[i]=1;
            }else{binarNumber[i]=0; }
        }
        System.out.print("Number=");
        for(int i=0; i<32;i++){
            System.out.print(binarNumber[i]);
        }
    }
}
