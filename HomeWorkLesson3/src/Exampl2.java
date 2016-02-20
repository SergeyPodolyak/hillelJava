import java.util.*;
import java.util.Scanner;

/**
 * Created by ADMIN on 20.02.16.
 */
public class Exampl2 {
    public static void main(String[] args) {
        Scanner newscaner =new Scanner(System.in);
        System.out.println("Input  werb");
        String werb = newscaner.nextLine();
        String[] werbArray = werb.split(" ");
for (int i=0; i<werbArray.length; i++){
    int paternLengs = werbArray[i].length()-1;
    char first = werbArray[i].charAt(0);
    char second = werbArray[i].charAt(paternLengs);
    String betwen = Integer.toString(paternLengs-1);
    werbArray[i]=first+betwen+second;

}
        for (int i=0; i<werbArray.length; i++){
            System.out.print(werbArray[i]+" ");
        }

    }
}
