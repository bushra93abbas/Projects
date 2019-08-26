package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class UsingLinkedHashSet {

    public static void main(String args[])
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");
        set.add("five");

        for(String word: set)
        {
            System.out.println(word);
        }

        set.forEach(System.out::println);

        Iterator itr = set.iterator() ;

        while(itr.hasNext())
        {

          Object str  = itr.next();
          System.out.println(str);

        }

    }




}
