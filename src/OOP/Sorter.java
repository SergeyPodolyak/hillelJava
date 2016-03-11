package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 11.03.2016.
 */
public class Sorter {
    public void sort(Comparable[] unsorted){
     boolean swap = false;
        do{
            swap=false;
            for (int i=0; i<unsorted.length-1; i++){
                if (unsorted[i].compareTo(unsorted[i+1])>0){
                 Comparable temp = unsorted[i];
                    unsorted[i]=unsorted[i+1];
                    unsorted[i+1]=temp;
                    swap=true;
                }
            }
        }while (swap);
    }

    public static void main(String[] args) {
        String[] a= {"a", "f", "c", "d"};
        new Sorter().sort(a);
        System.out.println(Arrays.toString(a));
    }
}
