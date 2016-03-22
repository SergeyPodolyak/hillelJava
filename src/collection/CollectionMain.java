package collection;

import OOP.Cat;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("ljh", "jsdvhg", 123, 5));
        list.add(new Cat("dv", "jsdvhg", 16523, 5));
        list.add(new Cat("58", "jsdvhg", 1243, 5));
        list.add(new Cat("huy", "zalupa", 15, 28));
        System.out.println(list);


        Object tom = list.get(3);
        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("ljh", "jsdvhg", 123, 5));
        linkedList.add(new Cat("ljh", "jsdvhg", 123, 5));
        linkedList.add(new Cat("ljh", "jsdvhg", 123, 5));
        linkedList.add(new Cat("ljh", "jsdvhg", 123, 5));
        System.out.println(linkedList.get(1));
        printList(list);
        printList(linkedList);
        Collection<Cat> cats= linkedList;
    }
public void printForIch(Collection<Cat> colection){
    for (Cat cat:colection
         ) {
        System.out.println(cat);
    }
}



    public static void printList(List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
