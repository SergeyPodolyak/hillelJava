package Pattern.HomeWork.Sortable;

/**
 * Created by ADMIN on 21.03.16.
 */
public class SortBubleFromMaxToMin implements Sortable {
    @Override
    public void sort(int[] unsorted) {

        for (int i = unsorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (unsorted[j]< unsorted[j + 1]) {
                    int tmp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = tmp;
                }
            }
        }

    }
}
