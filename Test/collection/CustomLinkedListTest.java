package collection;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MBCNEWMAIN on 22.03.2016.
 */
public class CustomLinkedListTest {

    @Test
    public void newInstanceShouldBeCreatedEmpty(){
        collection.CustomLinkedList list = new collection.CustomLinkedList();

        Assert.assertEquals(0, list.size());
    }

    @Test
    public void sizeShouldChangeOnAdd() {
        collection.CustomLinkedList list = new collection.CustomLinkedList();

        list.add(new Object());
        list.add(new Object());

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getShouldReturnAppropriateElement(){
        collection.CustomLinkedList list = new collection.CustomLinkedList();

        Object element = new Object();

        list.add(element);
        list.add(element);

        Assert.assertEquals(element, list.get(0));
        Assert.assertEquals(element, list.get(1));

    }
}