package Pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class IteratorMain {
    public static void main(String[] args) {
        Integer[] intejersArrey = new Integer[10];
        ArrayList<Integer> integerArreyList = new ArrayList<>();
        Iterator arrayIterator = new Arrayiterator(intejersArrey);
        iterate(arrayIterator);
    }

    public static void iterate(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator.hasNext();
        iterator.next();
    }


    public static void iterate(ArrayList<Integer> integers){
        for (int i=0; i<integers.size(); i++){
            System.out.println(integers.get(i));
        }
    }
    public static void iterate(Integer[] integers){
        for (int i=0; i<integers.length; i++){
            System.out.println(integers[i]);
        }
    }
}
