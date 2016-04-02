package collection.CollectionHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by ADMIN on 28.03.16.
 */
public class ProductivityTest {
    @Test
    public void addEllementsMustBeNormal(){
        LinkedList experimentalLinkedList = new LinkedList();
        Productivity.addToOurElement(experimentalLinkedList);
        Integer a =new Integer(1);
        Assert.assertEquals(a,experimentalLinkedList.get(1));
    }
    @Test
    public void chekSizeOfLinkedList(){
        LinkedList experimentalLinkedList = new LinkedList();
        Productivity.addToOurElement(experimentalLinkedList);

        Assert.assertEquals(1000000,experimentalLinkedList.size());
    }

}
