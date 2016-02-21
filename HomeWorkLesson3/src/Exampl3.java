import java.util.*;
import java.util.Scanner;

/**
 * Created by ADMIN on 01.01.02.
 */
public class Exampl3 {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        System.out.println("Input  werb");
        String werb = newscanner.nextLine();
        String[] werbArray = werb.split(",");
        int quantitiOfPolindroms=0;
        for (int i=0; i<werbArray.length;i++){
             werbArray[i]=werbArray[i].trim();
             String tempword=werbArray[i];
             int wordLength = werbArray[i].length();
             int wordCentre = wordLength/2;
             int literaequals = 0;
             for (int j=0; j<wordCentre; j++){
                 char firstlitera = tempword.charAt(j);
                 char secondlitera = tempword.charAt(wordLength-j-1);
                 if (firstlitera==secondlitera){
                     literaequals=literaequals+1;
                 }
             }
            if (literaequals==wordCentre){
                quantitiOfPolindroms=quantitiOfPolindroms+1;
            }

        }
        System.out.println("There are "+quantitiOfPolindroms+" palindromes in the text");
    }
}
