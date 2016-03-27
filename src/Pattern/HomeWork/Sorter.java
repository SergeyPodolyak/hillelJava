package Pattern.HomeWork;

import Pattern.HomeWork.Sortable.Sortable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ADMIN on 21.03.16.
 */
public class Sorter {
    private Sortable sortable;
    private int[] o;
    public Sorter(int[] o, Sortable sortable){
        this.sortable=sortable;
        this.o=o;
    }
    public int[] sort(){

        sortable.sort(o);
System.out.println(Arrays.toString(o));
return o;
    }
}
