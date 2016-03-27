package Pattern.HomeWork;

import static org.junit.Assert.*;

import Pattern.HomeWork.Sortable.SortBubleFromMaxToMin;
import Pattern.HomeWork.Sortable.SortBubleFromMinToMax;
import Pattern.HomeWork.Sortable.Sortable;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ADMIN on 21.03.16.
 */
public class SorterTest {
    @Test
    public void iDontKnowWhatTowright() {
        int[] numbers = {6, 5, 2, 1, 3, 4,};
        Sortable buble = new SortBubleFromMinToMax();
        Sortable buble2 = new SortBubleFromMaxToMin();
        Sorter sorter1 = new Sorter(numbers,buble);
        Sorter sorter2 = new Sorter(numbers,buble2);
        int[] a = sorter1.sort();
      //  int[] b =sorter2.sort();

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] expected2 = {6, 5, 4, 3, 2, 1};



        System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));


      //assertArrayEquals(expected2, b);


    }
}
