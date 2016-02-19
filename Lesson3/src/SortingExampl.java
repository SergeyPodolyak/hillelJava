/**
 * Created by User on 19.02.2016.
 */
public class SortingExampl {
    public static void main(String[] args) {
        int[] array = {2, 5, 5, 5, 8, 8, 9, 4, 6, 8};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minindex = j;

                }
            }
            int buf = array[i];
            array[i] = min;
            array[minindex] = buf;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
