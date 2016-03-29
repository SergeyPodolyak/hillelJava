package collection;

import OOP.Cat;
import collection.CatComparator;

import java.util.*;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
class CollectionsMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "gray", 2015,2));
        list.add(new Cat("tom", "gray", 2015,2));
        list.add(new Cat("tom", "gray", 2015,2));

        System.out.println(list);

        Cat tom = list.get(2);

        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("tom", "gray", 2015,2));
        linkedList.add(new Cat("tom", "gray", 2015,2));
        linkedList.add(new Cat("tom", "gray", 2015,2));

        System.out.println(linkedList.get(1));

        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;

        TreeSet<Cat> sortedCats = new TreeSet<> (new CatComparator());

        sortedCats.add(new Cat("tom", "gray", 2015,2));
        sortedCats.add(new Cat("tom", "gray", 2011,2));
        sortedCats.add(new Cat("tom", "gray", 2013,2));
        sortedCats.add(new Cat("Murzik", "gray", 2013,2));

        System.out.println("Set: ");
        printForEach(sortedCats);


    }

    public static void printForEach(Collection<Cat> collection){
        for(Cat cat: collection){
            System.out.println(cat);
        }
    }

    public static void printList(List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}