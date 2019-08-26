package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class ParseLinkedList {

    void parseUsingFor(LinkedList<Integer> list)
    {
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }


    void parseUsingForEach(LinkedList<Integer> list)
    {
        for(Integer value :list)
        {
           System.out.println(value);
        }
    }

    void parseUsingIterator(LinkedList<Integer> list)
    {

        Iterator itr = list.iterator();

        while(itr.hasNext())
        {
            Object value = itr.next();
            System.out.println(value);
        }
    }
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(30);
        list.add(50);

        ParseLinkedList obj = new ParseLinkedList();
        obj.parseUsingFor(list);

    }
}
