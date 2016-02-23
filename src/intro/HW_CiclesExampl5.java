package intro;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by ADMIN on 17.02.16.
 */
public class HW_CiclesExampl5 {
    public static void main(String[] args) {
        int a;
        int b;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input last number of Array");
        a = scanner.nextInt();
        System.out.println("Input sum of element");
        b = scanner.nextInt();
        int[] array=new int[a];
        for (int i=0;i<a; i++){
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]+",");
        }
int summ=0;
        for (int i=0; i<b;i++){
            summ=summ+array[i];
        }
        System.out.println("Summ of first "+b+" elements of array= "+summ);
    }
}