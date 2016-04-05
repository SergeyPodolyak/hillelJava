package collection;

import OOP.Cat;
import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 29.03.2016.
 */
public class MapMain {
    public static void main(String[] args) {
        Map<Cat, Integer> pesonToDiskount = new HashMap<>();
       pesonToDiskount.put( new Cat("Vasya","grey",5,5),10);
        pesonToDiskount.put( new Cat("Pety","grey",5,5),8);
        pesonToDiskount.put( new Cat("Her","grey",5,5),5);
        pesonToDiskount.put( new Cat("Tlya","grey",5,5),3);

        Integer vasyaDiskount = pesonToDiskount.get(10);
        System.out.println(vasyaDiskount);
        for (Map.Entry<Cat,Integer> personIntegerEntry:pesonToDiskount.entrySet()){
            System.out.println(personIntegerEntry.getKey()+" ' s diskount" + personIntegerEntry.getValue()+"");
doStaf(pesonToDiskount);
        }
        for (Cat person:pesonToDiskount.keySet()){

        }
        
    }

    private static void doStaf(Map<Cat, Integer> pesonToDiskount) {
    }
}
