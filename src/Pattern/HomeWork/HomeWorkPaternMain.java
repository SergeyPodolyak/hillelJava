package Pattern.HomeWork;

import Pattern.HomeWork.Sortable.SortBubleFromMaxToMin;
import Pattern.HomeWork.Sortable.SortBubleFromMinToMax;
import Pattern.HomeWork.Sortable.Sortable;
import Pattern.HomeWork.Sortable.sortChange;

/**
 * Created by ADMIN on 21.03.16.
 */
public class HomeWorkPaternMain {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 4, 150, 46, 4, 5};
        Sortable buble = new SortBubleFromMinToMax();
        Sortable buble2 = new SortBubleFromMaxToMin();
        new Sorter(numbers, buble).sort();
        new Sorter(numbers, buble2).sort();
    }
}
