package collection.CollectionHomeWork;

import java.util.ArrayList;

/**
 * Created by ADMIN on 27.03.16.
 */
public class CollectionHomeWorkMain {
    public static void main(String[] args) {
        ArrayList<Float> listFloat = new ArrayList<Float>();
        listFloat.add(1f);
        listFloat.add(2f);

        CollectionMulEllement mullElement=new CollectionMulEllement();
        System.out.println(mullElement.mullMetod(listFloat));

    }

}
