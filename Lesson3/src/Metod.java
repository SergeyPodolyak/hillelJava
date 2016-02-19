import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class Metod {
    public static void main(String[] args) {

        ScannerInput scannerInput = new ScannerInput().invoke();
        int size = scannerInput.getSize();
        int[] array = scannerInput.getArray();
        Scanner scaner = scannerInput.getScaner();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element: ");
            array[i] = scaner.nextInt();

        }
        System.out.println("Array: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.println(array[i]);

        }
    }

    private static class ScannerInput {
        private Scanner scaner;
        private int size;
        private int[] array;

        public Scanner getScaner() {
            return scaner;
        }

        public int getSize() {
            return size;
        }

        public int[] getArray() {
            return array;
        }

        public ScannerInput invoke() {
            scaner = new Scanner(System.in);
            System.out.println("Syz of array");
            size = scaner.nextInt();
            System.out.println("Fil up the array:");
            array = new int[size];
            return this;
        }
    }
}
