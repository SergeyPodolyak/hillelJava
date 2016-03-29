package OOP;

import collection.ReversedComparator;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
public class SorterTest {
    @Test
    public void yearShouldBeInAscendingOrder() {
        Sorter sorter = new Sorter();

        Cat tom = new Cat("tom", "white", 2013,2);
        Cat murzik = new Cat("murzik", "black", 2015,2);
        Cat barsik = new Cat("barsik", "grey", 2014,2);

        Cat[] cats = {tom, murzik, barsik};

        sorter.sort(cats, new collection.CatComparator());

        Cat[] expected = {tom, barsik, murzik};

        assertArrayEquals("Cats are in wrong order", expected, cats);
    }

    @Test
    public void yearShouldBeInDescendingOrder() {
        Sorter sorter = new Sorter();

        Cat tom = new Cat("tom", "white", 2013,3);
        Cat murzik = new Cat("murzik", "black", 2015,2);
        Cat barsik = new Cat("barsik", "grey", 2014,1);

        Cat[] cats = {tom, murzik, barsik};

        sorter.sort(cats, new ReversedComparator(new collection.CatComparator()));

        Cat[] expected = {murzik, barsik, tom};

        assertArrayEquals("Cats are in wrong order", expected, cats);
    }
}