package collection.CollectionHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ADMIN on 27.03.16.
 */
public class CollectionHomeWorkMainTest {
    @Test
    public void NewElementMustBeNull(){
        ArrayList<Float> listFloat = new ArrayList<Float>();
        Assert.assertEquals(0,listFloat.size());

    }

   @Test
    public void returnZero(){
        ArrayList<Float> listFloat = new ArrayList<Float>();
        CollectionMulEllement mullElement=new CollectionMulEllement();
        Assert.assertEquals(0f,mullElement.mullMetod(listFloat),0.1);

    }

    @Test
    public void returnNormalRezult(){
        ArrayList<Float> listFloat = new ArrayList<Float>();
listFloat.add(1f);
        listFloat.add(2f);

        CollectionMulEllement mullElement=new CollectionMulEllement();
        Assert.assertEquals(3,mullElement.mullMetod(listFloat),0.1);

    }
}
