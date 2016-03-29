package collection.CollectionHomeWork;

import java.util.ArrayList;

/**
 * Created by ADMIN on 27.03.16.
 */
public class CollectionMulEllement {

public float mullMetod(ArrayList<Float> list){
    float rezult = 0;
    if (list.size()==0){
        return 0;
    }else {
        for (Float floatElement : list) {
            rezult = rezult + floatElement;
        }
        return rezult;
    }

}

}
