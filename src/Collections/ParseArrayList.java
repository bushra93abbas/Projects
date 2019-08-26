package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ParseArrayList {


    void useForEach(ArrayList<Integer> list)
    {
        for(Integer value: list)
        {
            System.out.println(value);
        }
    }

    void useFor(ArrayList<Integer> list)
    {
        for(int i =0; i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    void useIterator(ArrayList<Integer> list)
    {
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            Object value = itr.next();
            System.out.println(value);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        ParseArrayList obj = new ParseArrayList();
       obj.useForEach(list);
       obj.useFor(list);
       obj.useIterator(list);

    }
}
