package Pattern.Iterator;

import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class Arrayiterator implements Iterator {
   private Integer[] array;
   private int currentIndex = 0;

    public Arrayiterator(Integer[] array){
        this.array=array;
    }

    @Override
    public boolean hasNext(){
        return  currentIndex<array.length;
    }
    @Override
    public Object next(){
        Integer current =array[currentIndex];
        currentIndex++;
        return null;
    }

}
