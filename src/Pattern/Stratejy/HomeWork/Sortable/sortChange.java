package Pattern.HomeWork.Sortable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ADMIN on 21.03.16.
 */
public class sortChange implements Sortable {
    @Override
    public void sort(int[] unsorted) {

        for (int i = unsorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (unsorted[j]<unsorted[j + 1]) {
                    int tmp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = tmp;
                }
            }
        }

    }
}

























   /**


    for (int i = 0; i < unsorted.length; i++) {

            Object min = unsorted[i];
            int min_i = i;

            for (int j = i + 1; j < unsorted.length; j++) {
                if (comparator.compare(unsorted[j],min)>0) {
                    min = unsorted[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                Object tmp = unsorted[i];
                unsorted[i] = unsorted[min_i];
                unsorted[min_i] = tmp;
            }
        }
    System.out.println(Arrays.toString(unsorted));
    }

    }


*/