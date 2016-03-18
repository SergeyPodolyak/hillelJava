package collection;

import OOP.Cat;

import java.util.ArrayList;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("ljh","jsdvhg",123,5));
        list.add(new Cat("dv","jsdvhg",16523,5));
        list.add(new Cat("58","jsdvhg",1243,5));
        list.add(new Cat("huy","zalupa",15,28));
       System.out.println(list);



        Object tom=list.get(3);
    }

}
