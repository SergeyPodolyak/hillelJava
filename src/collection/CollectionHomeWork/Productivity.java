package collection.CollectionHomeWork;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Created by ADMIN on 28.03.16.
 */
public class Productivity {
    public static void main(String[] args) {
        ArrayList experimentalArrayList = new ArrayList();
        LinkedList experimentalLinkedList = new LinkedList();
        TreeSet experimentalTreeSet = new TreeSet();

       addToOurElement(experimentalArrayList);
        System.out.println("Time of add element in the begin to Array List " + addInTheBegining(experimentalArrayList));

       System.out.println("Time of add element in the end to Array List " + addInTheEnd(experimentalArrayList));
        addToOurElement(experimentalLinkedList);
        System.out.println("Time of add element in the begin to Linked List " + addInTheBeginingLinkedList(experimentalLinkedList));

        System.out.println("Time of add element in the end to Linked List " + addInTheEndLinkedList(experimentalLinkedList));
    }

    public static void addToOurElement(Collection experimental) {
        for (int i = 0; i < 10000000; i++) {
            Integer a = new Integer(i);
            experimental.add(a);
        }
    }

    public static long addInTheBegining(ArrayList experimental) {
        Integer a = new Integer(5);
        Instant begin = Instant.now();
        experimental.add(1, a);
        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        return duration.toMillis();
    }

    public static long addInTheEnd(ArrayList experimental) {
        Integer a = new Integer(5);
        Instant begin = Instant.now();
        experimental.add(100, a);
        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        return duration.toMillis();

    }

    public static long addInTheBeginingLinkedList(LinkedList experimental) {
        Integer a = new Integer(5);
        Instant begin = Instant.now();
        experimental.add(1, a);
        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        return duration.toMillis();
    }
    public static long addInTheEndLinkedList(LinkedList experimental) {
        Integer a = new Integer(5);
        Instant begin = Instant.now();
        experimental.add(9999999, a);
        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        return duration.toMillis();

    }

}
