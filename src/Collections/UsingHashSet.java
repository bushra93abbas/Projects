package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UsingHashSet {

    public static void main(String args[])
    {

        HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(100);
        values.add(200);
        values.add(123);
        values.add(200);


        HashSet<String> names  = new HashSet<String>();
        names.add("Emma");
        names.add("Yash");
        names.add("Bush");
        names.add("Lily");

        ArrayList<String> list = new ArrayList<String>(names);
        Collections.sort(list);

        for(String name: list)
        {
            System.out.println(name);
        }

        for(Integer value:values)
        {
            System.out.println(value);
        }

    }

}
