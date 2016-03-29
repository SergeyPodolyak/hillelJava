package Pattern.Iterator;

import collection.ListElement;

import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class CustomLinkedListIterator implements Iterator {

    private ListElement next;
    public CustomLinkedListIterator(ListElement next){
        this.next=next;
    }
    @Override
    public boolean hasNext(){
        return next()!=null;
    }

    public ListElement getNext() {
        return next;
    }

    @Override
    public Object next(){
        Object value = next.getValue();
        next=next.getNext();
        return value;
    }


}
