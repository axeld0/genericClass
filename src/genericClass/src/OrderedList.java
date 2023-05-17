import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


//Create a generic class called "OrderedList" that can store elements in ascending or descending order.
// It should have methods to add and remove elements, and to retrieve the element at a specific position.
// Test your class with different types of elements and different sorting orders.
public class OrderedList <E extends Comparable> {

    private TreeSet<E> liltree;
    private boolean ascending;


    public OrderedList()
    {
        liltree = new TreeSet<>();
        ascending = false;
    }

    public OrderedList(boolean ascending)
    {
        liltree = new TreeSet<E>();
        this.ascending = ascending;
    }


    public boolean addElement(E element){

        boolean added = false;
        if(liltree !=null) {
            liltree.add(element);
            added = true;
        }
        return added;
    }

    public boolean removeElement (E element){
        boolean removed = false;
        if(liltree != null && liltree.contains(element))
        {
            liltree.remove(element);
            removed = true;
        }
        return removed;
    }

    public boolean searchElement (E element)
    {
        boolean itExist = false;
        if(liltree != null)
        {
            itExist =liltree.contains(element);
        }
        return itExist;
    }

    public E retrieveElement (int position) throws Exception {

        if(liltree!= null)
        {
            if(position >= 0 && position < liltree.size())
            {
                if(ascending)
                {
                    return (E) liltree.toArray()[position];
                }
                else
                {
                    return (E) liltree.descendingSet().toArray()[position];
                }
            }
            else {
                return null;
            }
        }
        else {
            throw new Exception("Sory, this is an empty collection.");
        }
    }

}
