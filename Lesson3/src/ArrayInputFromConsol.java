import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class ArrayInputFromConsol {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Syz of array");
        int size = scaner.nextInt();
        System.out.println("Fil up the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element: ");
            array[i] = scaner.nextInt();

        }
        System.out.println("Array: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.println(array[i]);

        }
    }
}
